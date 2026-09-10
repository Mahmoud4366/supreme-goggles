# ⚡ Nitro VPN

A fast, modern, multi-protocol VPN client for Android — 100% original code.

یه VPN Client چندپروتکله، سریع و مدرن برای اندروید — با کدی ۱۰۰٪ اورجینال. 🚀

## ✨ Features (roadmap)

- [x] Stage 1: Project foundation, Nitro theme, navigation
- [ ] Stage 2: Full UI — onboarding questions, protocol picker, dashboard, all settings
  (split tunneling, routing rules, speed test, auto-detect, logs)
- [ ] Stage 3: Tunnel core (sing-box multi-protocol + WireGuard)
- [ ] Stage 4: Config import (subscription URL, share links, QR, file) + fastest-server auto-select
- [ ] Stage 5: Psiphon chain (on/off toggle + country picker) + extras (widget, quick tile)

## 🛠️ Tech

- **Kotlin** + **Jetpack Compose (Material 3)**
- **DataStore** for settings, **OkHttp** for subscriptions
- Tunnel core: **sing-box** (multi-protocol) + **WireGuard** tunnel library (planned, Stage 3)
- minSdk 26 / targetSdk 34

## ▶️ Build

**APK (easiest):** every push auto-builds a debug APK with GitHub Actions —
download it from the [Actions](../../actions) tab → latest *Build Debug APK*
run → `nitro-vpn-debug` artifact, then install it on your phone 📱

> ⚠️ **One-time setup (by you, 2 min):** the coding bot has no permission to
> add workflow files, so please add it once via the website:
> 1. Open branch [`arena/01a08adb-supreme-goggles`](../../tree/arena/01a08adb-supreme-goggles)
> 2. *Add file → Create new file*, name it `.github/workflows/build-debug.yml`
> 3. Paste the content of [`docs/ci-build-debug.yml`](docs/ci-build-debug.yml), then *Commit changes*
> 4. Done — every push from then on builds the APK automatically ✅

**Android Studio:** open the project, let Gradle sync finish (needs internet), Run ▶️

## 📄 License

GPL-3.0-only — see [LICENSE](LICENSE) and [NOTICE](NOTICE).
