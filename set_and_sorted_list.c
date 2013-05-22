
m = (10.0, 10.3..30)   // gets continous range
m = m.round(1.0)  // gets integer values from continuous range
m = m.as(Set);          // turns it into a set (uniqe values)
m = m.as(SortedList);   // sorts the set
