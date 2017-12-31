package org.jplus.alg;

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = -1;
        int j = -1;
        int totalLength = nums1.length + nums2.length;
        int indexOn = 0;
        int beforeIndex = 0;
        double lastNumber = 0;
        while (true) {
            if (i + 1 == nums1.length && j + 1 < nums2.length) {
                j++;
                indexOn = 2;
            } else if (j + 1 == nums2.length && i + 1 < nums1.length) {
                i++;
                indexOn = 1;
            } else if (i + 1 < nums1.length && j + 1 < nums2.length) {
                if (nums1[i + 1] < nums2[j + 1]) {
                    i++;
                    indexOn = 1;
                } else {
                    j++;
                    indexOn = 2;
                }
            }
            if ((totalLength % 2) == 0) {
                if (beforeIndex == (totalLength - 2) / 2 + 1) {
                    if (indexOn == 1) {
                        return (lastNumber + (double) nums1[i]) / 2;
                    } else {
                        return (lastNumber + (double) nums2[j]) / 2;
                    }
                }
                if (indexOn == 1) {
                    lastNumber = nums1[i];
                } else {
                    lastNumber = nums2[j];
                }
            } else {
                if (beforeIndex == (totalLength - 1) / 2) {
                    if (indexOn == 1) {
                        return nums1[i];
                    } else {
                        return nums2[j];
                    }
                }
            }
            beforeIndex++;
        }
    }
}
