# Copyright (C) 2009-2015, O.S. Systems Software Ltda. All Rights Reserved
# Released under the MIT license (see packages/COPYING)

include firefox_crates_esr.inc
include firefox.inc

LIC_FILES_CHKSUM = "file://toolkit/content/license.html;md5=0d26be5aad971972857c5c42463792c4 \
                    file://LICENSE;md5=dc9b6ecd19a14a54a628edaaf23733bf"

FILESEXTRAPATHS:prepend := "${THISDIR}/firefox-esr:"

SRC_URI += "git://github.com/seanmonstar/warp;protocol=https;branch=master;name=warp;destsuffix=warp \
            git://github.com/glandium/mio;protocol=https;branch=windows-sys;name=mio;destsuffix=mio \
            git://github.com/mozilla/application-services.git;protocol=https;branch=release-v128-desktop;name=application-services;destsuffix=application-services \
            git://github.com/mozilla/audioipc;protocol=https;branch=cherry-pick-firefox-128-129;name=audioipc;destsuffix=audioipc \
            git://github.com/zakarumych/gpu-descriptor;protocol=https;branch=master;name=gpu-descriptor;destsuffix=gpu-descriptor \
            git://github.com/mozilla-spidermonkey/jsparagus;protocol=https;branch=ci_generated;name=jsparagus;destsuffix=jsparagus"

SRC_URI[sha256sum] = "2bedeb86c6cb16cd3fce88d42ae4e245bafe2c6e9221ba8e445b8e02e89d973f"

SRCREV_FORMAT .= "_application-services"
SRCREV_application-services = "7c275b9088557abcbc8f3c2834f9aaa9064ca5e4"
SRCREV_FORMAT .= "_mio"
SRCREV_mio = "9a2ef335c366044ffe73b1c4acabe50a1daefe05"

SRCREV_FORMAT .= "_neqo"
SRCREV_neqo = "121fe683ae4b39a5b694f671abfd397cbd9b4322"
SRCREV_FORMAT .= "_wgpu"
SRCREV_wgpu = "c7458638d14921c7562e4197ddeefa17be413587"

SRCREV_FORMAT .= "_audioipc"
SRCREV_audioipc = "e1071472c55193032aa4c1403317844005f9d0fc"

SRCREV_FORMAT .= "_warp"
SRCREV_warp = "9d081461ae1167eb321585ce424f4fef6cf0092b"

SRCREV_FORMAT .= "_cubeb-coreaudio"
SRCREV_cubeb-coreaudio = "8bce3b333a920999055397a397e59c2b81a93b9a"

SRCREV_FORMAT .= "_mapped_hyph"
SRCREV_mapped_hyph = "c7651a0cffff41996ad13c44f689bd9cd2192c01"

SRCREV_FORMAT .= "_aa-stroke"
SRCREV_aa-stroke = "d94278ed9c7020f50232689a26d1277eb0eb74d2"

SRCREV_FORMAT .= "_gpu-descriptor"
SRCREV_gpu-descriptor = "7b71a4e47c81903ad75e2c53deb5ab1310f6ff4d"

SRCREV_FORMAT .= "_mp4parse"
SRCREV_mp4parse = "a138e40ec1c603615873e524b5b22e11c0ec4820"

SRCREV_FORMAT .= "_jsparagus"
SRCREV_jsparagus = "61f399c53a641ebd3077c1f39f054f6d396a633c"
