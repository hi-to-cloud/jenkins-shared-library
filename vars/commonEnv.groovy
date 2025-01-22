def call(){
  env.NK = UUID.randomUUID().toString()
  env.TKN = credentials('tkn-007')
  env.PIPELINE_RUN_ID = UUID.randomUUID().toString()
  env.SETUP_CONTAINER = "scripts/setupContainer.sh"
  env.RUN_TESTS = "scripts/runTests.sh"
  env.CHECK_TESTS = "scripts/checkTests.sh"
  env.GET_PIPELINE_INFO = "scripts/getPipelineInfo.py"
  env.TESTS = "/usr/bin/tests"
  env.DASHBOARD_LINK = "Failed to create dashboard link"
  env.SUMMARY = "SITF Jenkins Pipeline Summary"
  env.FASTTRACK = "false"
  env.RUN_COUNT = 0
  env.JIRA_LIST = "No test failures"
  env.SLACK_COLOUR = "good"
  env.QUALITY_LINK = "Build Quality Dashboard"
  env.BRANCH = ""
  env.RELEASE = ""
  env.PRE_MERGE_TEST = "false"
  env.SYSTEM_NAME = "sitf-newton8"
}
