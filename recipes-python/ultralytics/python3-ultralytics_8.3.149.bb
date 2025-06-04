SUMMARY = "Ultralytics YOLOv8 for SOTA object detection, multi-object tracking, instance segmentation, pose estimation and image classification."
LICENSE = "AGPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=eb1e647870add0502f8f010b19de32af"

DEPENDS = "python3-numpy-native"

inherit pypi python_setuptools_build_meta

SRC_URI[sha256sum] = "87e4df2a16f5f00ab93fc2ab017e6a2ab2b1e68c20c08c0a234d65f347cde7eb"

RDEPENDS:${PN} = " \
	bash \
	python3-numpy \
	python3-matplotlib \
	python3-opencv \
	python3-pillow \
	python3-pyyaml \
	python3-requests \
	python3-scipy \
	python3-pytorch \
	python3-torchvision \
	python3-tqdm \
	python3-psutil \
	python3-py-cpuinfo \
	python3-pandas \
	python3-ultralytics-thop \
"
