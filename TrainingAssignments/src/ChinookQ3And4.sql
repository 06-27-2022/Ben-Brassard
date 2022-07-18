-- select "FirstName", "LastName", "CustomerId" from "Customer" where "Country" = 'Brazil';
-- union all 
-- select "InvoiceId", from "Invoice"

-- Question 3
select "Customer"."FirstName", "Customer"."LastName", "Invoice"."InvoiceId",
"Invoice"."InvoiceDate", "Invoice"."BillingCountry" from "Customer", "Invoice"
where "Customer"."CustomerId" = "Invoice"."CustomerId" and "Customer"."Country" = 'Brazil';

-- select * from "Employee" where "Title" like substring("Title" similar '#"Sales#"%' escape '#'); 

-- Question 4
select * from "Employee" where "Title" like 'Sales%';