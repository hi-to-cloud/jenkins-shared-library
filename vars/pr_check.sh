pr_check() {
    # Get the current branch name
    BRANCH_NAME=$(git rev-parse --abbrev-ref HEAD)

    # Check if the branch is not 'master'
    if [[ "$BRANCH_NAME" != "master" ]]; then
        echo "Cannot run pipeline within PR"
        exit 1  # Exit with error
    fi
}

main() {
    pr_check
}

main
