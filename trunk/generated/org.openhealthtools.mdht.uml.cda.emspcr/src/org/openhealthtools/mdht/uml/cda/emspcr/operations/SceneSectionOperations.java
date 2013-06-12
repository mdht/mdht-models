/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.FirstUnitOnScene;
import org.openhealthtools.mdht.uml.cda.emspcr.LocationTypeObservation;
import org.openhealthtools.mdht.uml.cda.emspcr.MassCasualtyIndicator;
import org.openhealthtools.mdht.uml.cda.emspcr.ScenePatientCount;
import org.openhealthtools.mdht.uml.cda.emspcr.SceneSection;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Scene Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionFirstUnitIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section First Unit Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionFirstUnitOnScene(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section First Unit On Scene</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionScenePatientCount(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Scene Patient Count</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionMassCasualtyIndicator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Mass Casualty Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#validateSceneSectionLocationTypeObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Location Type Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#getFirstUnitIndicator() <em>Get First Unit Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#getFirstUnitOnScene() <em>Get First Unit On Scene</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#getScenePatientCount() <em>Get Scene Patient Count</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#getMassCasualtyIndicator() <em>Get Mass Casualty Indicator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.SceneSection#getLocationTypeObservation() <em>Get Location Type Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SceneSectionOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected SceneSectionOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateSceneSectionTemplateId(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionTemplateId(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.17.3.10.1.8')";

	/**
	* The cached OCL invariant for the '{@link #validateSceneSectionTemplateId(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionTemplateId(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param sceneSection The receiving '<em><b>Scene Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSceneSectionTemplateId(SceneSection sceneSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_SECTION);
			try {
				VALIDATE_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sceneSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_SECTION__SCENE_SECTION_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("SceneSectionTemplateId"), new Object[] { sceneSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSceneSectionCode(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionCode(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '67665-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateSceneSectionCode(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionCode(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param sceneSection The receiving '<em><b>Scene Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSceneSectionCode(SceneSection sceneSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_SECTION);
			try {
				VALIDATE_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sceneSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_SECTION__SCENE_SECTION_CODE,
					EmspcrPlugin.INSTANCE.getString("SceneSectionCode"), new Object[] { sceneSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSceneSectionTitle(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Title</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionTitle(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'EMS Scene')";

	/**
	* The cached OCL invariant for the '{@link #validateSceneSectionTitle(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Title</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionTitle(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param sceneSection The receiving '<em><b>Scene Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSceneSectionTitle(SceneSection sceneSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_SECTION);
			try {
				VALIDATE_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sceneSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_SECTION__SCENE_SECTION_TITLE,
					EmspcrPlugin.INSTANCE.getString("SceneSectionTitle"), new Object[] { sceneSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSceneSectionText(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Text</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionText(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	* The cached OCL invariant for the '{@link #validateSceneSectionText(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Text</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionText(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param sceneSection The receiving '<em><b>Scene Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSceneSectionText(SceneSection sceneSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_SECTION);
			try {
				VALIDATE_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(sceneSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_SECTION__SCENE_SECTION_TEXT,
					EmspcrPlugin.INSTANCE.getString("SceneSectionText"), new Object[] { sceneSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSceneSectionFirstUnitIndicator(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section First Unit Indicator</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionFirstUnitIndicator(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::FirstUnitIndicator) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSceneSectionFirstUnitIndicator(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section First Unit Indicator</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionFirstUnitIndicator(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param sceneSection The receiving '<em><b>Scene Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSceneSectionFirstUnitIndicator(SceneSection sceneSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_SECTION);
			try {
				VALIDATE_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_SECTION_FIRST_UNIT_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sceneSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_SECTION__SCENE_SECTION_FIRST_UNIT_INDICATOR,
					EmspcrPlugin.INSTANCE.getString("SceneSectionFirstUnitIndicator"), new Object[] { sceneSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSceneSectionFirstUnitOnScene(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section First Unit On Scene</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionFirstUnitOnScene(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SCENE_SECTION_FIRST_UNIT_ON_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::FirstUnitOnScene) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSceneSectionFirstUnitOnScene(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section First Unit On Scene</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionFirstUnitOnScene(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SCENE_SECTION_FIRST_UNIT_ON_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param sceneSection The receiving '<em><b>Scene Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSceneSectionFirstUnitOnScene(SceneSection sceneSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SCENE_SECTION_FIRST_UNIT_ON_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_SECTION);
			try {
				VALIDATE_SCENE_SECTION_FIRST_UNIT_ON_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_SECTION_FIRST_UNIT_ON_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_SECTION_FIRST_UNIT_ON_SCENE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sceneSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_SECTION__SCENE_SECTION_FIRST_UNIT_ON_SCENE,
					EmspcrPlugin.INSTANCE.getString("SceneSectionFirstUnitOnScene"), new Object[] { sceneSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSceneSectionScenePatientCount(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Scene Patient Count</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionScenePatientCount(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::ScenePatientCount) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSceneSectionScenePatientCount(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Scene Patient Count</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionScenePatientCount(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param sceneSection The receiving '<em><b>Scene Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSceneSectionScenePatientCount(SceneSection sceneSection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_SECTION);
			try {
				VALIDATE_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_SECTION_SCENE_PATIENT_COUNT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sceneSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_SECTION__SCENE_SECTION_SCENE_PATIENT_COUNT,
					EmspcrPlugin.INSTANCE.getString("SceneSectionScenePatientCount"), new Object[] { sceneSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSceneSectionMassCasualtyIndicator(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Mass Casualty Indicator</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionMassCasualtyIndicator(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::MassCasualtyIndicator) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSceneSectionMassCasualtyIndicator(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Mass Casualty Indicator</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionMassCasualtyIndicator(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param sceneSection The receiving '<em><b>Scene Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSceneSectionMassCasualtyIndicator(SceneSection sceneSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_SECTION);
			try {
				VALIDATE_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_SECTION_MASS_CASUALTY_INDICATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sceneSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_SECTION__SCENE_SECTION_MASS_CASUALTY_INDICATOR,
					EmspcrPlugin.INSTANCE.getString("SceneSectionMassCasualtyIndicator"), new Object[] { sceneSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateSceneSectionLocationTypeObservation(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Location Type Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionLocationTypeObservation(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(emspcr::LocationTypeObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	* The cached OCL invariant for the '{@link #validateSceneSectionLocationTypeObservation(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Scene Section Location Type Observation</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateSceneSectionLocationTypeObservation(SceneSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/

	protected static Constraint VALIDATE_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param sceneSection The receiving '<em><b>Scene Section</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/

	public static boolean validateSceneSectionLocationTypeObservation(SceneSection sceneSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.SCENE_SECTION);
			try {
				VALIDATE_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SCENE_SECTION_LOCATION_TYPE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			sceneSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.SCENE_SECTION__SCENE_SECTION_LOCATION_TYPE_OBSERVATION,
					EmspcrPlugin.INSTANCE.getString("SceneSectionLocationTypeObservation"),
					new Object[] { sceneSection }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #getFirstUnitIndicator(SceneSection) <em>Get First Unit Indicator</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFirstUnitIndicator(SceneSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_FIRST_UNIT_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::FirstUnitIndicator))->asSequence()->any(true).oclAsType(emspcr::FirstUnitIndicator)";

	/**
	* The cached OCL query for the '{@link #getFirstUnitIndicator(SceneSection) <em>Get First Unit Indicator</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFirstUnitIndicator(SceneSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_FIRST_UNIT_INDICATOR__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static FirstUnitIndicator getFirstUnitIndicator(SceneSection sceneSection) {
		if (GET_FIRST_UNIT_INDICATOR__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SCENE_SECTION, EmspcrPackage.Literals.SCENE_SECTION.getEAllOperations().get(64));
			try {
				GET_FIRST_UNIT_INDICATOR__EOCL_QRY = helper.createQuery(GET_FIRST_UNIT_INDICATOR__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FIRST_UNIT_INDICATOR__EOCL_QRY);
		return (FirstUnitIndicator) query.evaluate(sceneSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getFirstUnitOnScene(SceneSection) <em>Get First Unit On Scene</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFirstUnitOnScene(SceneSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_FIRST_UNIT_ON_SCENE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::FirstUnitOnScene))->asSequence()->any(true).oclAsType(emspcr::FirstUnitOnScene)";

	/**
	* The cached OCL query for the '{@link #getFirstUnitOnScene(SceneSection) <em>Get First Unit On Scene</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getFirstUnitOnScene(SceneSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_FIRST_UNIT_ON_SCENE__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static FirstUnitOnScene getFirstUnitOnScene(SceneSection sceneSection) {
		if (GET_FIRST_UNIT_ON_SCENE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SCENE_SECTION, EmspcrPackage.Literals.SCENE_SECTION.getEAllOperations().get(65));
			try {
				GET_FIRST_UNIT_ON_SCENE__EOCL_QRY = helper.createQuery(GET_FIRST_UNIT_ON_SCENE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FIRST_UNIT_ON_SCENE__EOCL_QRY);
		return (FirstUnitOnScene) query.evaluate(sceneSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getScenePatientCount(SceneSection) <em>Get Scene Patient Count</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getScenePatientCount(SceneSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_SCENE_PATIENT_COUNT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::ScenePatientCount))->asSequence()->any(true).oclAsType(emspcr::ScenePatientCount)";

	/**
	* The cached OCL query for the '{@link #getScenePatientCount(SceneSection) <em>Get Scene Patient Count</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getScenePatientCount(SceneSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_SCENE_PATIENT_COUNT__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static ScenePatientCount getScenePatientCount(SceneSection sceneSection) {
		if (GET_SCENE_PATIENT_COUNT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SCENE_SECTION, EmspcrPackage.Literals.SCENE_SECTION.getEAllOperations().get(66));
			try {
				GET_SCENE_PATIENT_COUNT__EOCL_QRY = helper.createQuery(GET_SCENE_PATIENT_COUNT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SCENE_PATIENT_COUNT__EOCL_QRY);
		return (ScenePatientCount) query.evaluate(sceneSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getMassCasualtyIndicator(SceneSection) <em>Get Mass Casualty Indicator</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMassCasualtyIndicator(SceneSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_MASS_CASUALTY_INDICATOR__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::MassCasualtyIndicator))->asSequence()->any(true).oclAsType(emspcr::MassCasualtyIndicator)";

	/**
	* The cached OCL query for the '{@link #getMassCasualtyIndicator(SceneSection) <em>Get Mass Casualty Indicator</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getMassCasualtyIndicator(SceneSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_MASS_CASUALTY_INDICATOR__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static MassCasualtyIndicator getMassCasualtyIndicator(SceneSection sceneSection) {
		if (GET_MASS_CASUALTY_INDICATOR__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SCENE_SECTION, EmspcrPackage.Literals.SCENE_SECTION.getEAllOperations().get(67));
			try {
				GET_MASS_CASUALTY_INDICATOR__EOCL_QRY = helper.createQuery(GET_MASS_CASUALTY_INDICATOR__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MASS_CASUALTY_INDICATOR__EOCL_QRY);
		return (MassCasualtyIndicator) query.evaluate(sceneSection);
	}

	/**
	* The cached OCL expression body for the '{@link #getLocationTypeObservation(SceneSection) <em>Get Location Type Observation</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getLocationTypeObservation(SceneSection)
	* @generated
	* @ordered
	*/
	protected static final String GET_LOCATION_TYPE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(emspcr::LocationTypeObservation))->asSequence()->any(true).oclAsType(emspcr::LocationTypeObservation)";

	/**
	* The cached OCL query for the '{@link #getLocationTypeObservation(SceneSection) <em>Get Location Type Observation</em>}' query operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #getLocationTypeObservation(SceneSection)
	* @generated
	* @ordered
	*/
	protected static OCLExpression<EClassifier> GET_LOCATION_TYPE_OBSERVATION__EOCL_QRY;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/

	public static LocationTypeObservation getLocationTypeObservation(SceneSection sceneSection) {
		if (GET_LOCATION_TYPE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				EmspcrPackage.Literals.SCENE_SECTION, EmspcrPackage.Literals.SCENE_SECTION.getEAllOperations().get(68));
			try {
				GET_LOCATION_TYPE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_LOCATION_TYPE_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LOCATION_TYPE_OBSERVATION__EOCL_QRY);
		return (LocationTypeObservation) query.evaluate(sceneSection);
	}

} // SceneSectionOperations
