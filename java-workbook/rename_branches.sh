#!/bin/bash

branches=$(git branch --format="%(refname:short)" | grep '^feature/xellos216/')

for branch in $branches; do
    new_name=$(echo "$branch" | sed 's#^feature/xellos216/##' | sed 's/-solutions$//')

    git branch -m "$branch" "$new_name"
    echo "Renamed: $branch -> $new_name"
done

