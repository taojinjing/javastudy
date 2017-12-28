package org.jplus.alg;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = -1;
        int j = -1;
        int mediaIndex = (nums1.length + nums2.length) / 2;
        int indexOn = 0;
        while (i + j + 1 < mediaIndex) {
            if (i + 1 == nums1.length) {
                j = mediaIndex - i - 1;
                break;
            } else if (j + 1 == nums2.length) {
                i = mediaIndex - j - 1;
                break;
            }
            if (indexOn == 0) {
                if (nums1[i + 1] > nums2[j + 1]) {
                    j++;
                    indexOn = 2;
                } else {
                    i++;
                    indexOn = 1;
                }
            } else if (indexOn == 1) {
                if (nums2[j + 1] > nums1[i + 1]) {
                    i++;
                } else {
                    j++;
                    indexOn = 2;
                }
            } else if (indexOn == 2) {
                if (nums2[j + 1] > nums1[i + 1]) {
                    i++;
                    indexOn = 1;
                } else {
                    j++;
                }
            }
        }
        if (indexOn == 1) {
            return nums1[i];
        } else {
            return nums2[j];
        }
    }
}
