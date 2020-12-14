/* SUSHANT SINHA */

select distinct P1.Email
from Person as P1, Person as P2
where P1.Id != P2.Id and P1.Email = P2.Email