# Repro for missing scan value

1. `BAR=1 ./gradlew projects`
2. Check build scan custom values
3. `BAR=2 ./gradlew projects`
4. Check build scan custom values

## Expected

Both scans have custom values

## Actual

Only the first scan can custom value, second one does not.

[Example first run](https://scans.gradle.com/s/nwpt62sbr2xz2#custom-values)
[Example second run](https://scans.gradle.com/s/kx7umfwm66joy#custom-values)

## Notes

- Running with `--no-configuration-cache` does not reproduce this issue.
- If settings.gradle.kts (instead of Groovy) is used, it does not reproduce this issue.
