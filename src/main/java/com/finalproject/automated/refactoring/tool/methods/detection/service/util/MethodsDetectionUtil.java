package com.finalproject.automated.refactoring.tool.methods.detection.service.util;

import com.finalproject.automated.refactoring.tool.files.detection.model.FileModel;
import lombok.NonNull;

/**
 * @author Ismayadi Jamil
 * @version 1.0.0
 * @since 12 Juni 2019
 */

public interface MethodsDetectionUtil {

    String getMethodKey(@NonNull FileModel fileModel);
}
