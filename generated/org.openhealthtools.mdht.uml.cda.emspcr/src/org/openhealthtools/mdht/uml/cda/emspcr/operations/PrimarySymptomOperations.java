/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Primary Symptom</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptom#validatePrimarySymptomValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimarySymptomOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimarySymptomOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimarySymptomTemplateId(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomTemplateId(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_SYMPTOM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.66')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimarySymptomTemplateId(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomTemplateId(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIMARY_SYMPTOM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primarySymptom The receiving '<em><b>Primary Symptom</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrimarySymptomTemplateId(PrimarySymptom primarySymptom, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIMARY_SYMPTOM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_SYMPTOM);
			try {
				VALIDATE_PRIMARY_SYMPTOM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_SYMPTOM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_SYMPTOM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			primarySymptom)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIMARY_SYMPTOM__PRIMARY_SYMPTOM_TEMPLATE_ID,
					EmspcrPlugin.INSTANCE.getString("PrimarySymptomTemplateId"), new Object[] { primarySymptom }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimarySymptomMoodCode(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomMoodCode(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_SYMPTOM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimarySymptomMoodCode(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomMoodCode(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIMARY_SYMPTOM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primarySymptom The receiving '<em><b>Primary Symptom</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrimarySymptomMoodCode(PrimarySymptom primarySymptom, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIMARY_SYMPTOM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_SYMPTOM);
			try {
				VALIDATE_PRIMARY_SYMPTOM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_SYMPTOM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_SYMPTOM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			primarySymptom)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIMARY_SYMPTOM__PRIMARY_SYMPTOM_MOOD_CODE,
					EmspcrPlugin.INSTANCE.getString("PrimarySymptomMoodCode"), new Object[] { primarySymptom }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimarySymptomCodeP(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomCodeP(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_SYMPTOM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimarySymptomCodeP(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomCodeP(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIMARY_SYMPTOM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primarySymptom The receiving '<em><b>Primary Symptom</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrimarySymptomCodeP(PrimarySymptom primarySymptom, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIMARY_SYMPTOM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_SYMPTOM);
			try {
				VALIDATE_PRIMARY_SYMPTOM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_SYMPTOM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_SYMPTOM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(primarySymptom)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIMARY_SYMPTOM__PRIMARY_SYMPTOM_CODE_P,
					EmspcrPlugin.INSTANCE.getString("PrimarySymptomCodeP"), new Object[] { primarySymptom }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptomCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptomCodeP", passToken);
				}
				passToken.add(primarySymptom);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimarySymptomCode(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomCode(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_SYMPTOM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '67774-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimarySymptomCode(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomCode(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIMARY_SYMPTOM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primarySymptom The receiving '<em><b>Primary Symptom</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrimarySymptomCode(PrimarySymptom primarySymptom, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.emspcr.PrimarySymptomCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(primarySymptom)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_PRIMARY_SYMPTOM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_SYMPTOM);
			try {
				VALIDATE_PRIMARY_SYMPTOM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_SYMPTOM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_SYMPTOM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(primarySymptom)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIMARY_SYMPTOM__PRIMARY_SYMPTOM_CODE,
					EmspcrPlugin.INSTANCE.getString("PrimarySymptomCode"), new Object[] { primarySymptom }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimarySymptomValue(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomValue(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_SYMPTOM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = element.oclAsType(datatypes::CD) in "
			+ "value.codeSystem = '2.16.840.1.113883.6.90'))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimarySymptomValue(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomValue(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIMARY_SYMPTOM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primarySymptom The receiving '<em><b>Primary Symptom</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrimarySymptomValue(PrimarySymptom primarySymptom, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIMARY_SYMPTOM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_SYMPTOM);
			try {
				VALIDATE_PRIMARY_SYMPTOM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_SYMPTOM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_SYMPTOM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(primarySymptom)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIMARY_SYMPTOM__PRIMARY_SYMPTOM_VALUE,
					EmspcrPlugin.INSTANCE.getString("PrimarySymptomValue"), new Object[] { primarySymptom }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePrimarySymptomValueP(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomValueP(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRIMARY_SYMPTOM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePrimarySymptomValueP(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Primary Symptom Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePrimarySymptomValueP(PrimarySymptom, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_PRIMARY_SYMPTOM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param primarySymptom The receiving '<em><b>Primary Symptom</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePrimarySymptomValueP(PrimarySymptom primarySymptom, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_PRIMARY_SYMPTOM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PRIMARY_SYMPTOM);
			try {
				VALIDATE_PRIMARY_SYMPTOM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PRIMARY_SYMPTOM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PRIMARY_SYMPTOM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			primarySymptom)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, EmspcrValidator.DIAGNOSTIC_SOURCE,
					EmspcrValidator.PRIMARY_SYMPTOM__PRIMARY_SYMPTOM_VALUE_P,
					EmspcrPlugin.INSTANCE.getString("PrimarySymptomValueP"), new Object[] { primarySymptom }));
			}

			return false;
		}
		return true;
	}

} // PrimarySymptomOperations
