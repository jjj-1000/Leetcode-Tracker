-- Last updated: 7/9/2026, 3:12:30 PM
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET N=N-1;
  RETURN (
      # Write your MySQL query statement below.
        
      
        SELECT DISTINCT salary
        FROM Employee
        ORDER BY salary DESC
        LIMIT N,1
      
  );
END