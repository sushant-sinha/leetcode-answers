# SUSHANT SINHA

# 838ms ( 7.20% ) 0b ( 100% )

# Write your MySQL query statement below
select Name as Employee from Employee as emp where Salary>(select Salary from Employee as man where man.Id=emp.ManagerId);