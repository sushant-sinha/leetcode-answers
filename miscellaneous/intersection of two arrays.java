Solution using Java Collections

Convert first array to the set

Convert second array to the set

Use retainAll to find set intersection

Convert intersection set to array

// O(max(n, m)) time, O(n + m) space
public int[] intersection(int[] nums1, int[] nums2) {
  Set<Integer> a = new HashSet<>(Arrays.stream(nums1).boxed().collect(Collectors.toList()));
  Set<Integer> b = new HashSet<>(Arrays.stream(nums2).boxed().collect(Collectors.toList()));
  a.retainAll(b);
  return a.stream().mapToInt(Integer::intValue).toArray();
}
Solution sing sorting

Sort first array

Sort second array

Use two pointers to traverse first and second sorted arrays

If first pointer points to bigger value - move the second pointer

If second pointer points to bigger value - move the first pointer

If pointers point to equal values add it to result array and move both pointers to the next distinct value

Repeate 4-6 until any pointer reaches the end of array

Shrink the size of intersection array to remove unused space

// O(max(n, m) log max(n, m)) time, O(min(n, m)) space
public int[] intersection(int[] nums1, int[] nums2) {
  Arrays.sort(nums1);
  Arrays.sort(nums2);
  int[] intersect = new int[Math.min(nums1.length, nums2.length)];
  int i = 0;
  for (int p1 = 0, p2 = 0; p1 < nums1.length && p2 < nums2.length;) {
    while (p1 < nums1.length && nums1[p1] < nums2[p2]) {
      p1++;
    }
    while (p1 < nums1.length && p2 < nums2.length && nums1[p1] > nums2[p2]) {
      p2++;
    }
    if (p1 < nums1.length && p2 < nums2.length && nums1[p1] == nums2[p2]) {
      intersect[i++] = nums1[p1];
      while (p1 < nums1.length && nums1[p1] == intersect[i-1]) {
          p1++;
      }
      while (p2 < nums2.length && nums2[p2] == intersect[i-1]) {
          p2++;
      }
    }
  }                
  int[] result = new int[i];
  for (; i-1 >= 0; i--) {
    result[i-1] = intersect[i-1];
  }
  return result;
}
Brute-force solution

For each element in first array traverse second array

While traversing second array check for values match

If there is a match check if it is unique by traversing intersection array

If match is unique add it to intersection array.

Shrink intersection array

// nums1.length = n, nums2.length = m
// O (n * m * min(n, m)) time, O(min(n, m)) space
public int[] intersection(int[] nums1, int[] nums2) {
  int[] intersect = new int[Math.min(nums1.length, nums2.length)];
  int index = 0;
  for (int i = 0; i < nums1.length; i++) {
    for (int j = 0; j < nums2.length; j++) {
      if (nums1[i] == nums2[j]) {
        boolean isUnique = true;
        for (int k = 0; k < index; k++) {
          if (nums1[i] == intersect[k]) {
            isUnique = false;
          }
        }
        if (isUnique) {
          intersect[index++] = nums1[i];   
        }
      }
    }
  }
  int[] result = new int[index];
  for (; index-1 >= 0; index--) {
    result[index-1] = intersect[index-1];
  }
  return result;
}