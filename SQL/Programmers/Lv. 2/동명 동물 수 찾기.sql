SELECT NAME, COUNT(*) AS "count"
FROM ANIMAL_INS
GROUP BY NAME
HAVING count > 1
    AND NAME IS NOT NULL
ORDER BY NAME