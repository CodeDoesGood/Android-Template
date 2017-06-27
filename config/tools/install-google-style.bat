REM Installs Google's IntelliJ configs into your user configs.
@echo off
echo Installing Google IntelliJ configs...

setlocal enableDelayedExpansion

for /D %%i in (%userprofile%\.AndroidStudio*) do call :copy_config %%i
for /D %%i in (%userprofile%\.IdeaIC*) do call :copy_config %%i
for /D %%i in (%userprofile%\.IntelliJIdea*) do call :copy_config %%i

echo.
echo Restart IntelliJ and/or AndroidStudio, go to preferences, and apply 'GoogleStyle'.
exit /b

REM sub function for copy config files
:copy_config
set config_dir=%~1\
echo Installing to !config_dir!
xcopy /s codestyles !config_dir!
echo Done.
echo.
exit /b