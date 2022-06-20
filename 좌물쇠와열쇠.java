class Solution {
    public boolean solution(int[][] key, int[][] lock) {

        int k = key.length;
        int l = lock.length;

        int i, j;

        int len = l + (k * 2) - 2; //확장  
        int[][] map = new int[len][len]; //확장 배열

        for (i = k - 1; i < k + l - 1; i++) {
            for (j = k - 1; j < k + l - 1; j++) {
                map[i][j] = lock[i - (k - 1)][j - (k - 1)];
            }
        }
        //4번 조사
        for (i = 0; i < 4; i++) {
            if (check(map, key, l)) {
                return true;
            }
            rotate(key); //90도 회전
        }
        return false;
    }

    private boolean check(int[][] map, int[][] key, int locklen) {
        int keylen = key.length;
        int maplen = map.length;

        int i, j, z, x;

        for (i = 0; i < maplen - keylen + 1; i++) {
            for (j = 0; j < maplen - keylen + 1; j++) {
                for (z = 0; z < keylen; z++) {
                    for (x = 0; x < keylen; x++) {
                        map[i + z][j + x] += key[z][x];
                    }
                }
                //자물쇠 전부 1 확인
                boolean flag = true;
                for (int k = keylen - 1; k < keylen + locklen - 1; k++) {
                    for (int l = keylen - 1; l < keylen + locklen - 1; l++) {
                        if (map[k][l] != 1) {
                            flag = false;
                            break;
                        }
                    }
                    if (!flag) break;
                }
                if (flag) {
                    return true;
                }
                //map 초기화
                for (int k = 0; k < keylen; k++) {
                    for (int l = 0; l < keylen; l++) {
                        map[i + k][j + l] -= key[k][l];
                    }
                }
            }
        }
        return false;
    }

    private void rotate(int[][] key) {
        int len = key.length;

        int i, j;

        int[][] temp = new int[len][len];

        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                temp[i][j] = key[len - j - 1][i];
            }
        }
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                key[i][j] = temp[i][j];
            }
        }
    }
}