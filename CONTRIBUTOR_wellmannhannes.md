# Contributor: Hannes Wellmann

**Email:** wellmann.hannes1@gmx.net

## Files Initially Contributed

This document lists all files initially contributed by Hannes Wellmann to the m2e-core-tests repository.

### Root Directory

- `.project`

### org.eclipse.m2e.editor.tests/

- `org.eclipse.m2e.editor.tests/.classpath`
- `org.eclipse.m2e.editor.tests/.project`

### org.eclipse.m2e.tests/

**Total files in this directory: 13**

<details>
<summary>Click to expand file list</summary>

- `org.eclipse.m2e.tests/.classpath`
- `org.eclipse.m2e.tests/.project`
- `org.eclipse.m2e.tests/projects/downloadsources/p009/.classpath`
- `org.eclipse.m2e.tests/projects/downloadsources/p009/.project`
- `org.eclipse.m2e.tests/projects/downloadsources/p009/pom.xml`
- `org.eclipse.m2e.tests/repositories/testrepo-src/downloadsources/downloadsources-t009/pom.xml`
- `org.eclipse.m2e.tests/repositories/testrepo-src/downloadsources/downloadsources-t009/src/main/java/a/A.java`
- `org.eclipse.m2e.tests/repositories/testrepo/downloadsources/downloadsources-t009/0.0.1-SNAPSHOT/downloadsources-t009-0.0.1-20210904.071644-1-javadoc.jar`
- `org.eclipse.m2e.tests/repositories/testrepo/downloadsources/downloadsources-t009/0.0.1-SNAPSHOT/downloadsources-t009-0.0.1-20210904.071644-1-sources.jar`
- `org.eclipse.m2e.tests/repositories/testrepo/downloadsources/downloadsources-t009/0.0.1-SNAPSHOT/downloadsources-t009-0.0.1-20210904.071644-1.jar`
- `org.eclipse.m2e.tests/repositories/testrepo/downloadsources/downloadsources-t009/0.0.1-SNAPSHOT/downloadsources-t009-0.0.1-20210904.071644-1.pom`
- `org.eclipse.m2e.tests/repositories/testrepo/downloadsources/downloadsources-t009/0.0.1-SNAPSHOT/maven-metadata.xml`
- `org.eclipse.m2e.tests/repositories/testrepo/downloadsources/downloadsources-t009/maven-metadata.xml`

</details>

## All Commits

Total commits: 49

- `900e448b` - Update verification build and scmUrl to forked repository
- `da85ee3a` - Add new required package to m2e.tests MANIFEST.MF
- `056b30ee` - Replace org.eclipse.core.runtime.Path by IPath
- `a129b555` - Consider slf4j.api as valid classpath name
- `4c6884c8` - Use Import-Package for maven-archetype instead of Require-Bundle
- `78f57077` - Ignore ImportSortOrderTestCase.testCollectionSortProject()
- `06a892ce` - Allow http access for P2 in tests
- `3c878123` - Remove now obsolete embedded remoterepo artifacts
- `ed0850f2` - Fetch test deps from Maven-Central instead of embedded remoterepo
- `82058518` - Remove unused dependencies
- `d9193a5a` - Bump m2e-core pom version to 2.1.0
- `f472a2e7` - Remove all code-templates but the copyright header and make that generic
- `f323844f` - Use more standard methods in tests
- `e9c3e062` - Adapt MavenRuntimeManagerTest to slf4j from Maven-Central
- `e9d1744d` - Adapt to Properties->Map replacement in ArchetypeGenerator
- `0421894b` - Use static Status factories in tests
- `5535c2fd` - Remove 'its' profile and directly include the only remaining test-plugin
- `fb4aad31` - Revert "Adapt MavenLaunchDelegateTest to not yet present console coloring"
- `8b36acbf` - Adapt MavenLaunchDelegateTest to not yet present console coloring
- `89b41087` - Remove o.e.m2e.editor.tests to move them upwards into 'm2e-core' repo
- `685e37e2` - Adapt to improved mavenProject caching
- `700bf6f4` - Remove duplicated pom-elements already inherited from parent
- `4659d965` - Remove embedded Maven-repo in o.e.m2e.editor.tests and unused projects
- `c6f8ee10` - Adapt to replacement of Arrays by suitable Collections in m2e.core APIs
- `180b77bb` - Deduplicate project GAV
- `1c8b60b2` - Bump remaining Plug-ins to version 2.0.0 and remove dependency versions
- `4e4fa124` - Adapt to m2e.lifecycle clean-ups
- `f9f0cf89` - Move org.eclipse.m2e.editor.tests to Java 17
- `6610b009` - Use try-with-resources and fix sonar-complaints
- `45fb67a0` - Adapt to record conversion (#159)
- `8a06b65b` - Update m2e-core parent to version 2.0.0 (#164)
- `baed2bc6` - Adapt tests to ArcheTypeUtil move (#156)
- `d74ab387` - Use IProfileManager service in tests
- `7a32e82f` - Fix warnings (#154)
- `4ee5c436` - Unify and simplify test-projects (#152)
- `7fd1fc38` - Use Mockito to simplify mocking (#151)
- `f142fe2b` - Adapt to removal of IMavenLauncherConfiguration API
- `205741f5` - Replace use of deprecated m2e.core API methods
- `4eea7e46` - Replace deprecated methods, fix warnings and use Mockito
- `8f7ffa23` - Remove obsolete/broken indexer tests
- `9570fda5` - Adapt SourceLocationHelperTest to more source information available
- `71375117` - Re-add Require-Bundle org.eclipse.m2e.maven.indexer
- `c3598cb5` - Unify and simplify plug-in meta-data
- `033ba176` - [DownloadSources] add tests for re-download and SNAPSHOT versions (#252)
- `db463c7a` - [TestRepo] add all modules to aggregate and make it work with JDK-11
- `f2652356` - [BuildPathManagerTest] Unify code structure (extract methods)
- `f486732b` - Fix Eclipse warnings in build.properties
- `9a8cbce2` - Update Bundle-RequiredExecutionEnvironment to JavaSE-11
- `5273e2c7` - m2e-core issue #271 : Fix integration-tests failing on Windows


---

## License Declaration

Please check the box below to indicate your agreement:

- [x] I hereby declare that I contribute my source code mentioned in this file under the terms of the EPL 2.0 license.

**EPL 2.0 License:** https://www.eclipse.org/legal/epl-2.0/
