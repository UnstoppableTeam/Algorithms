package org.example;

// Java implementation of the approach

class FindIntersection
{

    // Function to print the intersection
    static void findIntersection(int intervals[][], int N)
    {
        // First interval
        int l = intervals[0][0];
        int r = intervals[0][1];

        // Check rest of the intervals
        // and find the intersection
        for (int i = 1; i < N; i++)
        {

            // If no intersection exists
            if (intervals[i][0] > r ||
                    intervals[i][1] < l)
            {
                System.out.println(-1);
                return;
            }

            // Else update the intersection
            else
            {
                l = Math.max(l, intervals[i][0]);
                r = Math.min(r, intervals[i][1]);
            }
        }
        System.out.println ("[" + l +", " + r + "]");
    }

    // Driver code

}

// This Code is contributed by ajit..
