/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Self Care Activities</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities#validateSelfCareActivitiesValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelfCareActivitiesOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfCareActivitiesOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSelfCareActivitiesTemplateId(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesTemplateId(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SELF_CARE_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.128')";

	/**
	 * The cached OCL invariant for the '{@link #validateSelfCareActivitiesTemplateId(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesTemplateId(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SELF_CARE_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param selfCareActivities The receiving '<em><b>Self Care Activities</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSelfCareActivitiesTemplateId(SelfCareActivities selfCareActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SELF_CARE_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SELF_CARE_ACTIVITIES);
			try {
				VALIDATE_SELF_CARE_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SELF_CARE_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SELF_CARE_ACTIVITIES_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			selfCareActivities)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SELF_CARE_ACTIVITIES__SELF_CARE_ACTIVITIES_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("SelfCareActivitiesSelfCareActivitiesTemplateId"),
					new Object[] { selfCareActivities }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSelfCareActivitiesClassCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesClassCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SELF_CARE_ACTIVITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateSelfCareActivitiesClassCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesClassCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SELF_CARE_ACTIVITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param selfCareActivities The receiving '<em><b>Self Care Activities</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSelfCareActivitiesClassCode(SelfCareActivities selfCareActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SELF_CARE_ACTIVITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SELF_CARE_ACTIVITIES);
			try {
				VALIDATE_SELF_CARE_ACTIVITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SELF_CARE_ACTIVITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SELF_CARE_ACTIVITIES_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			selfCareActivities)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SELF_CARE_ACTIVITIES__SELF_CARE_ACTIVITIES_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("SelfCareActivitiesSelfCareActivitiesClassCode"),
					new Object[] { selfCareActivities }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSelfCareActivitiesMoodCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesMoodCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SELF_CARE_ACTIVITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateSelfCareActivitiesMoodCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesMoodCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SELF_CARE_ACTIVITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param selfCareActivities The receiving '<em><b>Self Care Activities</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSelfCareActivitiesMoodCode(SelfCareActivities selfCareActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SELF_CARE_ACTIVITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SELF_CARE_ACTIVITIES);
			try {
				VALIDATE_SELF_CARE_ACTIVITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SELF_CARE_ACTIVITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SELF_CARE_ACTIVITIES_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			selfCareActivities)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SELF_CARE_ACTIVITIES__SELF_CARE_ACTIVITIES_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("SelfCareActivitiesSelfCareActivitiesMoodCode"),
					new Object[] { selfCareActivities }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSelfCareActivitiesCodeP(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesCodeP(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SELF_CARE_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateSelfCareActivitiesCodeP(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesCodeP(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SELF_CARE_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param selfCareActivities The receiving '<em><b>Self Care Activities</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSelfCareActivitiesCodeP(SelfCareActivities selfCareActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SELF_CARE_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SELF_CARE_ACTIVITIES);
			try {
				VALIDATE_SELF_CARE_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SELF_CARE_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SELF_CARE_ACTIVITIES_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			selfCareActivities)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SELF_CARE_ACTIVITIES__SELF_CARE_ACTIVITIES_CODE_P,
					ConsolPlugin.INSTANCE.getString("SelfCareActivitiesSelfCareActivitiesCodeP"),
					new Object[] { selfCareActivities }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.SelfCareActivitiesCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.SelfCareActivitiesCodeP", passToken);
				}
				passToken.add(selfCareActivities);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSelfCareActivitiesCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SELF_CARE_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = '46008-9' or value.code = '28409-1' or value.code = '28408-3' or value.code = '46484-2' or value.code = '46482-6' or value.code = '28413-3' or value.code = '45618-6' or value.code = '45619-4'))";

	/**
	 * The cached OCL invariant for the '{@link #validateSelfCareActivitiesCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesCode(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SELF_CARE_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param selfCareActivities The receiving '<em><b>Self Care Activities</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSelfCareActivitiesCode(SelfCareActivities selfCareActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.SelfCareActivitiesCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(selfCareActivities)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_SELF_CARE_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SELF_CARE_ACTIVITIES);
			try {
				VALIDATE_SELF_CARE_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SELF_CARE_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SELF_CARE_ACTIVITIES_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			selfCareActivities)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SELF_CARE_ACTIVITIES__SELF_CARE_ACTIVITIES_CODE,
					ConsolPlugin.INSTANCE.getString("SelfCareActivitiesSelfCareActivitiesCode"),
					new Object[] { selfCareActivities }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSelfCareActivitiesValue(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesValue(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SELF_CARE_ACTIVITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '371153006' or value.code = '371154000' or value.code = '371152001')))";

	/**
	 * The cached OCL invariant for the '{@link #validateSelfCareActivitiesValue(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesValue(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SELF_CARE_ACTIVITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param selfCareActivities The receiving '<em><b>Self Care Activities</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSelfCareActivitiesValue(SelfCareActivities selfCareActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SELF_CARE_ACTIVITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SELF_CARE_ACTIVITIES);
			try {
				VALIDATE_SELF_CARE_ACTIVITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SELF_CARE_ACTIVITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SELF_CARE_ACTIVITIES_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			selfCareActivities)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SELF_CARE_ACTIVITIES__SELF_CARE_ACTIVITIES_VALUE,
					ConsolPlugin.INSTANCE.getString("SelfCareActivitiesSelfCareActivitiesValue"),
					new Object[] { selfCareActivities }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSelfCareActivitiesValueP(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesValueP(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SELF_CARE_ACTIVITIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateSelfCareActivitiesValueP(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Self Care Activities Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSelfCareActivitiesValueP(SelfCareActivities, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_SELF_CARE_ACTIVITIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param selfCareActivities The receiving '<em><b>Self Care Activities</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateSelfCareActivitiesValueP(SelfCareActivities selfCareActivities,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SELF_CARE_ACTIVITIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SELF_CARE_ACTIVITIES);
			try {
				VALIDATE_SELF_CARE_ACTIVITIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SELF_CARE_ACTIVITIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SELF_CARE_ACTIVITIES_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			selfCareActivities)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.SELF_CARE_ACTIVITIES__SELF_CARE_ACTIVITIES_VALUE_P,
					ConsolPlugin.INSTANCE.getString("SelfCareActivitiesSelfCareActivitiesValueP"),
					new Object[] { selfCareActivities }));
			}

			return false;
		}
		return true;
	}

} // SelfCareActivitiesOperations
