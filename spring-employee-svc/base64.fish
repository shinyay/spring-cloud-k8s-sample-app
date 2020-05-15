#!/usr/bin/env fish

function do_func
  argparse -n base64.fish 'h/help' 'p/param=' -- $argv
  or return 1

  if set -lq _flag_help
    echo "base64.fish -p/--param <PARAMETER>"
    return
  end

  set -lq _flag_param
  or set -l _flag_param "PARAMETER"

  echo parameter: $_flag_param
  echo -n $_flag_param | base64
end

do_func $argv
