package _96_codingTest_7_setup_buildFrame;

import java.util.Arrays;

//기둥과 보 설치
public class Solution {
    private int n;
    private boolean[][] hasColumn;
    private boolean[][] hasBeam;

    public int[][] solution(int n, int[][] build_frame) {
        this.n = n + 1;

        hasColumn = new boolean[n + 1][n + 1];
        hasBeam = new boolean[n + 1][n + 1];

        for (int[] frame : build_frame) {
            int x = frame[0], y = frame[1];
            boolean isColumn = frame[2] == 0;
            boolean isRemoving = frame[3] == 0;

            if (isColumn) {
                if (isRemoving) {
                    if (isAvailableToRemoveColumn(x, y)) {
                        hasColumn[x][y] = false;
                    } else {
                        System.out.println("remove column: " + Arrays.toString(frame));
                    }
                } else {
                    if (isAvailableToPlaceColumn(x, y)) {
                        hasColumn[x][y] = true;
                    } else {
                        System.out.println("place column: " + Arrays.toString(frame));
                    }
                }
            } else {
                if (isRemoving) {
                    if (isAvailableToRemoveBeam(x, y)) {
                        hasBeam[x][y] = false;
                    } else {
                        System.out.println("remove beam: " + Arrays.toString(frame));
                    }
                } else {
                    if (isAvailableToPlaceBeam(x, y)) {
                        hasBeam[x][y] = true;
                    } else {
                        System.out.println("place beam: " + Arrays.toString(frame));
                    }
                }
            }
        }

        int numStructures = 0;

        for (int i = 0; i < n + 1; ++i) {
            for (int j = 0; j < n + 1; ++j) {
                if (hasColumn[i][j]) {
                    numStructures++;
                }

                if (hasBeam[i][j]) {
                    numStructures++;
                }
            }
        }

        int[][] result = new int[numStructures][3];
        int k = 0;

        for (int i = 0; i < n + 1; ++i) {
            for (int j = 0; j < n + 1; ++j) {
                if (hasColumn[i][j]) {
                    result[k][0] = i;
                    result[k][1] = j;
                    result[k][2] = 0;

                    k++;
                }

                if (hasBeam[i][j]) {
                    result[k][0] = i;
                    result[k][1] = j;
                    result[k][2] = 1;

                    k++;
                }
            }
        }

        return result;
    }

    private boolean hasColumn(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n && hasColumn[x][y];
    }

    private boolean hasBeam(int x, int y) {
        return x >= 0 && x < n && y >= 0 && y < n && hasBeam[x][y];
    }

    private boolean isAvailableToRemoveColumn(int x, int y) {
        return hasColumn(x, y)
            && (!hasColumn(x, y + 1) || (hasBeam(x - 1, y + 1) || hasBeam(x, y + 1)))
            && (!hasBeam(x, y + 1) || (hasColumn(x + 1, y) || hasBeam(x - 1, y + 1) && hasBeam(x + 1, y + 1)))
            && (!hasBeam(x - 1, y + 1) || (hasColumn(x - 1, y) || hasBeam(x - 2, y + 1) && hasBeam(x, y + 1)));
    }

    private boolean isAvailableToPlaceColumn(int x, int y) {
        return !hasColumn(x, y)
            && (y == 0 || hasBeam(x, y) || hasBeam(x - 1, y) || hasColumn(x, y - 1));
    }

    private boolean isAvailableToRemoveBeam(int x, int y) {
        return hasBeam(x, y)
            && (!hasColumn(x, y) || (y == 0 || hasBeam(x - 1, y) || hasColumn(x, y - 1)))
            && (!hasColumn(x + 1, y) || (y == 0 || hasBeam(x + 1, y) || hasColumn(x + 1, y - 1)))
            && (!hasBeam(x - 1, y) || (hasColumn(x - 1, y - 1) || hasColumn(x, y - 1)))
            && (!hasBeam(x + 1, y) || (hasColumn(x + 1, y - 1) || hasColumn(x + 2, y - 1)));
    }

    private boolean isAvailableToPlaceBeam(int x, int y) {
        return !hasBeam(x, y)
            && (hasColumn(x, y - 1) || hasColumn(x + 1, y - 1) || hasBeam(x - 1, y) && hasBeam(x + 1, y));
    }
    
	public static void main(String[] args) {
		int n = 5;
		int[][] build_frame1 = {{1,0,0,1},{1,1,1,1},{2,1,0,1},{2,2,1,1},{5,0,0,1},{5,1,0,1},{4,2,1,1},{3,2,1,1}};
		int[][] build_frame2 = {{0,0,0,1},{2,0,0,1},{4,0,0,1},{0,1,1,1},{1,1,1,1},{2,1,1,1},{3,1,1,1},{2,0,0,0},{1,1,1,0},{2,2,0,1}};
		Solution solution = new Solution();
		int[][] answer1 = solution.solution(n, build_frame1);
		int[][] answer2 = solution.solution(n, build_frame2);
		System.out.println("answer1 : "+ Arrays.deepToString(answer1));
		System.out.println("answer1 : "+ Arrays.deepToString(answer2));
	}
}
/*
문제 설명
빙하가 깨지면서 스노우타운에 떠내려 온 죠르디는 인생 2막을 위해 주택 건축사업에 뛰어들기로 결심하였습니다. 죠르디는 기둥과 보를 이용하여 벽면 구조물을 자동으로 세우는 로봇을 개발할 계획인데, 그에 앞서 로봇의 동작을 시뮬레이션 할 수 있는 프로그램을 만들고 있습니다.
프로그램은 2차원 가상 벽면에 기둥과 보를 이용한 구조물을 설치할 수 있는데, 기둥과 보는 길이가 1인 선분으로 표현되며 다음과 같은 규칙을 가지고 있습니다.

 - 기둥은 바닥 위에 있거나 보의 한쪽 끝 부분 위에 있거나, 또는 다른 기둥 위에 있어야 합니다.
 - 보는 한쪽 끝 부분이 기둥 위에 있거나, 또는 양쪽 끝 부분이 다른 보와 동시에 연결되어 있어야 합니다.
단, 바닥은 벽면의 맨 아래 지면을 말합니다.

2차원 벽면은 n x n 크기 정사각 격자 형태이며, 각 격자는 1 x 1 크기입니다. 맨 처음 벽면은 비어있는 상태입니다. 기둥과 보는 격자선의 교차점에 걸치지 않고, 격자 칸의 각 변에 정확히 일치하도록 설치할 수 있습니다. 다음은 기둥과 보를 설치해 구조물을 만든 예시입니다.

기둥과보-1.jpg

예를 들어, 위 그림은 다음 순서에 따라 구조물을 만들었습니다.

1. (1, 0)에서 위쪽으로 기둥을 하나 설치 후, (1, 1)에서 오른쪽으로 보를 하나 만듭니다.
2. (2, 1)에서 위쪽으로 기둥을 하나 설치 후, (2, 2)에서 오른쪽으로 보를 하나 만듭니다.
3. (5, 0)에서 위쪽으로 기둥을 하나 설치 후, (5, 1)에서 위쪽으로 기둥을 하나 더 설치합니다.
4. (4, 2)에서 오른쪽으로 보를 설치 후, (3, 2)에서 오른쪽으로 보를 설치합니다.
만약 (4, 2)에서 오른쪽으로 보를 먼저 설치하지 않고, (3, 2)에서 오른쪽으로 보를 설치하려 한다면 2번 규칙에 맞지 않으므로 설치가 되지 않습니다. 기둥과 보를 삭제하는 기능도 있는데 기둥과 보를 삭제한 후에 남은 기둥과 보들 또한 위 규칙을 만족해야 합니다. 만약, 작업을 수행한 결과가 조건을 만족하지 않는다면 해당 작업은 무시됩니다.

벽면의 크기 n, 기둥과 보를 설치하거나 삭제하는 작업이 순서대로 담긴 2차원 배열 build_frame이 매개변수로 주어질 때, 모든 명령어를 수행한 후 구조물의 상태를 return 하도록 solution 함수를 완성해주세요.

제한사항
 - n은 5 이상 100 이하인 자연수입니다.
 - build_frame의 세로(행) 길이는 1 이상 1,000 이하입니다.
 - build_frame의 가로(열) 길이는 4입니다.
 - build_frame의 원소는 [x, y, a, b]형태입니다.
	- x, y는 기둥, 보를 설치 또는 삭제할 교차점의 좌표이며, [가로 좌표, 세로 좌표] 형태입니다.
	- a는 설치 또는 삭제할 구조물의 종류를 나타내며, 0은 기둥, 1은 보를 나타냅니다.
	- b는 구조물을 설치할 지, 혹은 삭제할 지를 나타내며 0은 삭제, 1은 설치를 나타냅니다.
	- 벽면을 벗어나게 기둥, 보를 설치하는 경우는 없습니다.
	- 바닥에 보를 설치 하는 경우는 없습니다.
 - 구조물은 교차점 좌표를 기준으로 보는 오른쪽, 기둥은 위쪽 방향으로 설치 또는 삭제합니다.
 - 구조물이 겹치도록 설치하는 경우와, 없는 구조물을 삭제하는 경우는 입력으로 주어지지 않습니다.
 - 최종 구조물의 상태는 아래 규칙에 맞춰 return 해주세요.
	- return 하는 배열은 가로(열) 길이가 3인 2차원 배열로, 각 구조물의 좌표를 담고있어야 합니다.
	- return 하는 배열의 원소는 [x, y, a] 형식입니다.
	- x, y는 기둥, 보의 교차점 좌표이며, [가로 좌표, 세로 좌표] 형태입니다.
 	- 기둥, 보는 교차점 좌표를 기준으로 오른쪽, 또는 위쪽 방향으로 설치되어 있음을 나타냅니다.
	- a는 구조물의 종류를 나타내며, 0은 기둥, 1은 보를 나타냅니다.
	- return 하는 배열은 x좌표 기준으로 오름차순 정렬하며, x좌표가 같을 경우 y좌표 기준으로 오름차순 정렬해주세요.
	- x, y좌표가 모두 같은 경우 기둥이 보보다 앞에 오면 됩니다.

입출력 예에 대한 설명
입출력 예 #1
문제의 예시와 같습니다.

입출력 예 #2
여덟 번째 작업을 수행 후 아래와 같은 구조물 만들어집니다.

기둥과보-2.jpg

아홉 번째 작업의 경우, (1, 1)에서 오른쪽에 있는 보를 삭제하면 (2, 1)에서 오른쪽에 있는 보는 조건을 만족하지 않으므로 무시됩니다.

열 번째 작업의 경우, (2, 2)에서 위쪽 방향으로 기둥을 세울 경우 조건을 만족하지 않으므로 무시됩니다.
*/
