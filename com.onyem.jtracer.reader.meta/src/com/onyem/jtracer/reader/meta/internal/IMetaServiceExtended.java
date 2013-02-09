package com.onyem.jtracer.reader.meta.internal;

import com.onyem.jtracer.reader.meta.IClass;
import com.onyem.jtracer.reader.meta.IMetaService;

public interface IMetaServiceExtended extends IMetaService {

  IClass getClassByCanonicalName(String name);

  IClass getInterfaceByCanonicalName(String name);

}
