// SUSHANT SINHA

public class Solution extends VersionControl {
  public int firstBadVersion(int n) {
    int min = n;
    int l = 1;
    int r = n;
    int mid = 0;
    while (l <= r) {
      mid = l + (r - l) / 2;
      boolean check = isBadVersion(mid);
      if (check) {
        min = mid;
        r = mid - 1;
      }
      if (!check) {
        l = mid + 1;
      }
    }
    return min;
  }
}