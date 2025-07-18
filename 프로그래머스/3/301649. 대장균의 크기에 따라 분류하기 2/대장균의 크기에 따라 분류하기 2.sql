SELECT ID,
CASE
 WHEN A.R/C <= 0.25 THEN 'CRITICAL'
 WHEN A.R/C <= 0.5 THEN 'HIGH'
 WHEN A.R/C <= 0.75 THEN 'MEDIUM'
 ELSE 'LOW'
END COLONY_NAME
FROM (
SELECT ID,
    RANK() OVER (ORDER BY SIZE_OF_COLONY DESC) R,
    COUNT(*) OVER() C
FROM ECOLI_DATA) A
ORDER BY 1 ASC