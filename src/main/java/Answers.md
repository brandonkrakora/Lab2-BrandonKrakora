What is the complexity of each of the four search methods in terms of array or list size n?
    - findTeamPosition() for array and list is O(n): Linear Search
    - findTeamFunding() for array is O(n), same thing for list(not implemented): Linear search
    - findTeamFundingFast() for array is O(log n), same thing for list(not implemented): Binary Search
What happens in the case of binary search if the array is not sorted?
 - The algorithm wouldn't be efficient, it could possibly takes longer to run if the algorithm does finish.
What is the purpose of constructor argument validity checking?
 - The purpose of argument validity checking to make sure users are inputting the correct data type and not any null reference.
What is the purpose of using the keyword final with variables and arguments?
 - The purpose of using the keyword final with variables and arguments to make sure the value is immutable and cannot be modified.
What are alternatives to using Optional and how do they compare?
 - The alternatives of using optional is to return a boolean. The Optional can return the index position when it is true and return 0
 when it is false. Using boolean would not allow you to return the index position when it is true, but you can just return 'false' when it is false.
 Another alternatives is to return type int. If it is true, return the index position integer. If false, return -1 integer.
