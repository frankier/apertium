sed 's/:0</</g' | /home/fran/local/bin/apertium-tagger -g /home/fran/local/share/apertium/apertium-is-en/is-en.prob |/home/fran/local/bin/apertium-pretransfer|/home/fran/local/bin/apertium-transfer -n /home/fran/local/share/apertium/apertium-is-en/apertium-is-en.is-en.t0x  /home/fran/local/share/apertium/apertium-is-en/is-en.t0x.bin |/home/fran/local/bin/apertium-transfer /home/fran/local/share/apertium/apertium-is-en/apertium-is-en.is-en.t1x  /home/fran/local/share/apertium/apertium-is-en/is-en.t1x.bin  /home/fran/local/share/apertium/apertium-is-en/is-en.autobil.bin |/home/fran/local/bin/apertium-interchunk /home/fran/local/share/apertium/apertium-is-en/apertium-is-en.is-en.t2x  /home/fran/local/share/apertium/apertium-is-en/is-en.t2x.bin |/home/fran/local/bin/apertium-interchunk /home/fran/local/share/apertium/apertium-is-en/apertium-is-en.is-en.t3x  /home/fran/local/share/apertium/apertium-is-en/is-en.t3x.bin |/home/fran/local/bin/apertium-postchunk /home/fran/local/share/apertium/apertium-is-en/apertium-is-en.is-en.t4x  /home/fran/local/share/apertium/apertium-is-en/is-en.t4x.bin |/home/fran/local/bin/lt-proc -n /home/fran/local/share/apertium/apertium-is-en/is-en.autogen.bin |/home/fran/local/bin/lt-proc -p /home/fran/local/share/apertium/apertium-is-en/is-en.autopgen.bin |  /home/fran/source/apertium/trunk/apertium-lex-learner/irstlm-ranker /home/fran/corpora/català/en.blm
