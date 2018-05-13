A dirty read occurs when one transaction reads changes made by another transaction that haven’t yet
been committed (see Table 13-2). Basically, a dirty read means reading uncommitted data.

Table 13-2. Dirty Read: A Transaction Reading Uncommitted Data
Time Transaction Account
T1 Transaction 1 begins.
T2 Transaction 2 begins.
T3 Transaction 1 updates record R1.
T4 Transaction 2 reads uncommitted record R1.
T5 Transaction 1 rolls back its update.
T6 Transaction 2 commits.


An unrepeatable read occurs when a transaction reads a record twice, and the record state is different
between the first and the second read. This happens when another transaction updates the state of the
record between the two reads (see Table 13-3).

Table 13-3. Unrepeatable Read: A Transaction Reading a Record Twice
Time Transaction Account
T1 Transaction 1 begins.
T2 Transaction 1 reads record R1.
T3 Transaction 2 begins.
T4 Transaction 2 updates record R1.
T5 Transaction 2 commits.
T6 Transaction 1 reads record R1 (the record R1 read at time
T2 is in a different state than at time T6).
T7 Transaction 1 commits


A phantom read occurs when a transaction executes two identical queries, and the collection of rows
returned by the second query is different from the first. It also happens when another transaction inserts
records into or deletes records from the table between the two reads.

Table 13-4. Phantom Read: Reading a Range of Data That Changes in Size During a Transaction
Time Transaction Account
T1 Transaction 1 begins.
T2 Transaction 1 reads a range of records RG1.
T3 Transaction 2 begins.
T4 Transaction 2 inserts records.
T5 Transaction 2 commits.
T6 Transaction 1 reads the range of records RG1 (RG1’s size has changed from time T2 to T6).
T7 Transaction 1 commits.