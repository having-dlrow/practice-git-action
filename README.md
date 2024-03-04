## 변경 기반, Release 자동 생성
- [Release Drafter](https://github.com/marketplace/actions/release-drafter)
- 변경을 기반으로 Release 작성 해준다.

## Pull Request label 자동 생성
- [labeler](https://github.com/actions/labeler)
- Pull Request, Issue의 label을 정해진 조건(commit 메시지, Directory)에 맞춰 자동 생성해준다.

## 

## Github Action

기본 구조
```
name: {{ Job 이름 }}
on: {{ Trigger 종류 }}

jobs:
 push-job:
   runs-on: {{ 실행할 환경 }}
   steps: 
   - name: {{ Step 이름 }}
     run: {{ 한개 명령어 }}
   - name: {{ Step 이름 }}
     run: |
       {{ 여러 라인의 명령어 }}
```
### Event

#### Trigger 종류
1. `push`
2. [`pull_request`](https://docs.github.com/ko/actions/using-workflows/events-that-trigger-workflows#pull_request)
3. `issue`
4. `issue_comment`
5. `schedule`
6. [`workflow_dispatch`](https://docs.github.com/ko/actions/using-workflows/events-that-trigger-workflows#workflow_dispatch) : 수동으로 버튼을 눌러 실행 (값 지정 가능.)
7. [`needs`](https://docs.github.com/ko/actions/using-workflows/workflow-syntax-for-github-actions#jobsjob_idneeds) : Job간의 종속성/순서를 지정할 때
8. `re-run`

#### Workflow
1. `checkout`: `actions/checkout@{version}`, 저장소 clone 실행
2. `context`: `${{ toJSON(github)}}` 변수를 통해 실행에 필요한 context 정보 사용
3. `cache`: `actions/cache@{version}`, key, restore-key로 파일변경시 다시 캐시 지원

#### CI/CD 구축
##### 시나리오 A
1. 워크플로우 구성
2. AWS EKS 구성

##### 시나리오 B

##### 시나리오 C
##### 시나리오 D


#### CI/CD 버저닝

#### 그외
#### Github Organization
#### Github Access Token
