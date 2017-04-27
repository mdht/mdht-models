/**
 */
package org.openhealthtools.mdht.uml.cda.clondata.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.clondata.CLONDATAPackage;
import org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.ChemotherapeuticDrugTherapyDiscontinued#validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChemotherapeuticDrugTherapyDiscontinuedOperations extends ClinicalStatementOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChemotherapeuticDrugTherapyDiscontinuedOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedTemplateId(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedTemplateId(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.43')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedTemplateId(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedTemplateId(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedTemplateId(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedClassCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedClassCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedClassCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedClassCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedClassCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedCodeP(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in " +
			"value.code = '274512008' and value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEffectiveTime(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEffectiveTime(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEffectiveTime(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEffectiveTime(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedEffectiveTime(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_EFFECTIVE_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedEffectiveTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedMoodCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedMoodCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedMoodCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedMoodCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedMoodCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedStatusCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedStatusCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedStatusCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedStatusCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedStatusCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedValue(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedValue(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedValue(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedValue(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedValue(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationClassCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationClassCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationClassCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationClassCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationClassCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCodeP(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = code.oclAsType(datatypes::CD) in " +
			"value.code = '373832009' and value.codeSystem = '2.16.840.1.113883.6.96'))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationMoodCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationMoodCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationMoodCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationMoodCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationMoodCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined() and statusCode.oclIsKindOf(datatypes::CS) and " +
			"let value : datatypes::CS = statusCode.oclAsType(datatypes::CS) in " + "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCode(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCode(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCodeP(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCodeP(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationStatusCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationValue(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationValue(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::CD))))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationValue(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationValue(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationValue(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservationValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservation(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservation(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservation(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chemotherapeutic Drug Therapy Discontinued Entry Relationship Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservation(ChemotherapeuticDrugTherapyDiscontinued, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chemotherapeuticDrugTherapyDiscontinued The receiving '<em><b>Chemotherapeutic Drug Therapy Discontinued</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservation(
			ChemotherapeuticDrugTherapyDiscontinued chemotherapeuticDrugTherapyDiscontinued,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getChemotherapeuticDrugTherapyDiscontinued());
			try {
				VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chemotherapeuticDrugTherapyDiscontinued)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED__CHEMOTHERAPEUTIC_DRUG_THERAPY_DISCONTINUED_ENTRY_RELATIONSHIP_OBSERVATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"ChemotherapeuticDrugTherapyDiscontinuedChemotherapeuticDrugTherapyDiscontinuedEntryRelationshipObservation",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										chemotherapeuticDrugTherapyDiscontinued, context) }),
						new Object[] { chemotherapeuticDrugTherapyDiscontinued }));
			}

			return false;
		}
		return true;
	}

} // ChemotherapeuticDrugTherapyDiscontinuedOperations
