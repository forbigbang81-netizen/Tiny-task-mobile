# Mobile TinyTask (Auto Clicker) Setup Guide

This repository contains the logic for a mobile macro recorder and player.

## How to use the CI/CD Pipeline
1. Create a folder in your root directory named `.github`.
2. Inside `.github`, create another folder named `workflows`.
3. Place the `android.yml` file provided in this repository inside that folder.

## How to Download the APK
Once you push this code to your GitHub repository:
1. Click on the **Actions** tab at the top of your GitHub page.
2. Click on the latest workflow run (usually named "Android CI").
3. Scroll down to **Artifacts**.
4. You will see `auto-clicker-debug-apk`. Click it to download the zip containing your installer.

## Architecture
- **Floating Service:** Uses `WindowManager` to stay on top.
- **Accessibility Service:** Uses `dispatchGesture` to simulate touches.
