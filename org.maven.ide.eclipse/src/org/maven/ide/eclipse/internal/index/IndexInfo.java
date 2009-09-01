/*******************************************************************************
 * Copyright (c) 2008 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/

package org.maven.ide.eclipse.internal.index;

import java.io.File;
import java.net.URL;
import java.util.Date;


/**
 * Index info
 * 
 * @author Eugene Kuleshov
 */
public class IndexInfo {

  private final File repositoryDir;

  private final String repositoryUrl;

  private final Type type;

  private final boolean isShort;

  private String indexUpdateUrl;
  
  private URL archiveUrl;
  
  private Date updateTime;

  private boolean isNew;
  
  private String displayName;
  

  public IndexInfo(File repositoryDir, String repositoryUrl, Type type, boolean isShort) {
    this.repositoryDir = repositoryDir;
    this.repositoryUrl = repositoryUrl;
    this.type = type;
    this.isShort = isShort;
  }

  public File getRepositoryDir() {
    return repositoryDir;
  }

  public String getRepositoryUrl() {
    return repositoryUrl;
  }
  
  public String getIndexUpdateUrl() {
    return indexUpdateUrl;
  }
  
  public void setIndexUpdateUrl(String indexUpdateUrl) {
    this.indexUpdateUrl = indexUpdateUrl;
  }

  public Type getType() {
    return type;
  }
  
  public boolean isShort() {
    return this.isShort;
  }
  
  public URL getArchiveUrl() {
    return this.archiveUrl;
  }
  
  public void setArchiveUrl(URL archiveUrl) {
    this.archiveUrl = archiveUrl;
  }
  
  public boolean isNew() {
    return this.isNew;
  }
  
  public void setNew(boolean isNew) {
    this.isNew = isNew;
  }

  public Date getUpdateTime() {
    return updateTime == null ? null : new Date(updateTime.getTime());
  }
  
  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime == null ? null : new Date(updateTime.getTime());
  }
  
  public boolean equals(Object obj) {
    if(!(obj instanceof IndexInfo)) {
      return false;
    }
    IndexInfo other = (IndexInfo) obj;
    return repositoryUrl.equals(other.repositoryUrl);
  }

  public int hashCode() {
    return repositoryUrl.hashCode();
  }
  
  /**
   * @param displayName The displayName to set.
   */
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * @return Returns the displayName.
   */
  public String getDisplayName() {
    if(displayName == null || displayName.length()==0){
      return this.repositoryUrl;
    }
    return this.displayName;
  }
  
  public String getSimpleDisplayName(){
    return displayName;
  }
  
  public boolean hasDisplayName(){
    return displayName != null && displayName.length() > 0;
  }

  /**
   * Repository index type
   */
  public static class Type {
    public static final Type REMOTE = new Type("remote");

    public static final Type LOCAL = new Type("local");

    public static final Type WORKSPACE = new Type("workspace");

    private final String type;

    private Type(String type) {
      this.type = type;
    }

    public String toString() {
      return type;
    }

    public static Type forKey(String key) {
      if(REMOTE.type.equals(key)) {
        return REMOTE;
      } else if(LOCAL.type.equals(key)) {
        return LOCAL;
      } else if(WORKSPACE.type.equals(key)) {
        return WORKSPACE;
      }
      return null;
    }

  }

}
