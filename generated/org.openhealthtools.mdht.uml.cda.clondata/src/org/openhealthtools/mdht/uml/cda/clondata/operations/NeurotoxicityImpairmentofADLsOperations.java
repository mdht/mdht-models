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
import org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs;
import org.openhealthtools.mdht.uml.cda.clondata.util.CLONDATAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs#validateNeurotoxicityImpairmentofADLsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs#validateNeurotoxicityImpairmentofADLsEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs#validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs#validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs#validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs#validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs#validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs#validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs#validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs#validateNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.clondata.NeurotoxicityImpairmentofADLs#validateNeurotoxicityImpairmentofADLsEntryRelationshipObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NeurotoxicityImpairmentofADLsOperations extends ClinicalStatementOperations {
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
	protected NeurotoxicityImpairmentofADLsOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurotoxicityImpairmentofADLsTemplateId(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsTemplateId(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.30.3.37')";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurotoxicityImpairmentofADLsTemplateId(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsTemplateId(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurotoxicityImpairmentofADLs The receiving '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurotoxicityImpairmentofADLsTemplateId(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNeurotoxicityImpairmentofADLs());
			try {
				VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				neurotoxicityImpairmentofADLs)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NeurotoxicityImpairmentofADLsNeurotoxicityImpairmentofADLsTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										neurotoxicityImpairmentofADLs, context) }),
						new Object[] { neurotoxicityImpairmentofADLs }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationship(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationship(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationship(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationship(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurotoxicityImpairmentofADLs The receiving '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurotoxicityImpairmentofADLsEntryRelationship(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNeurotoxicityImpairmentofADLs());
			try {
				VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				neurotoxicityImpairmentofADLs)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NeurotoxicityImpairmentofADLsNeurotoxicityImpairmentofADLsEntryRelationship",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										neurotoxicityImpairmentofADLs, context) }),
						new Object[] { neurotoxicityImpairmentofADLs }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('classCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurotoxicityImpairmentofADLs The receiving '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNeurotoxicityImpairmentofADLs());
			try {
				VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				neurotoxicityImpairmentofADLs)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NeurotoxicityImpairmentofADLsNeurotoxicityImpairmentofADLsEntryRelationshipObservationClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										neurotoxicityImpairmentofADLs, context) }),
						new Object[] { neurotoxicityImpairmentofADLs }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurotoxicityImpairmentofADLs The receiving '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNeurotoxicityImpairmentofADLs());
			try {
				VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				neurotoxicityImpairmentofADLs)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NeurotoxicityImpairmentofADLsNeurotoxicityImpairmentofADLsEntryRelationshipObservationCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										neurotoxicityImpairmentofADLs, context) }),
						new Object[] { neurotoxicityImpairmentofADLs }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = code.oclAsType(datatypes::CD) in " + "value.code = 'ASSERTION'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurotoxicityImpairmentofADLs The receiving '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNeurotoxicityImpairmentofADLs());
			try {
				VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				neurotoxicityImpairmentofADLs)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NeurotoxicityImpairmentofADLsNeurotoxicityImpairmentofADLsEntryRelationshipObservationCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										neurotoxicityImpairmentofADLs, context) }),
						new Object[] { neurotoxicityImpairmentofADLs }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationId(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationId(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationId(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationId(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurotoxicityImpairmentofADLs The receiving '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationId(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNeurotoxicityImpairmentofADLs());
			try {
				VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				neurotoxicityImpairmentofADLs)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NeurotoxicityImpairmentofADLsNeurotoxicityImpairmentofADLsEntryRelationshipObservationId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										neurotoxicityImpairmentofADLs, context) }),
						new Object[] { neurotoxicityImpairmentofADLs }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject(isDefined('moodCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurotoxicityImpairmentofADLs The receiving '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNeurotoxicityImpairmentofADLs());
			try {
				VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				neurotoxicityImpairmentofADLs)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NeurotoxicityImpairmentofADLsNeurotoxicityImpairmentofADLsEntryRelationshipObservationMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										neurotoxicityImpairmentofADLs, context) }),
						new Object[] { neurotoxicityImpairmentofADLs }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((statusCode.oclIsUndefined() or statusCode.isNullFlavorUndefined()) implies (not statusCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurotoxicityImpairmentofADLs The receiving '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNeurotoxicityImpairmentofADLs());
			try {
				VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				neurotoxicityImpairmentofADLs)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_STATUS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NeurotoxicityImpairmentofADLsNeurotoxicityImpairmentofADLsEntryRelationshipObservationStatusCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										neurotoxicityImpairmentofADLs, context) }),
						new Object[] { neurotoxicityImpairmentofADLs }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).observation->excluding(null)->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and " +
			"let value : datatypes::CD = element.oclAsType(datatypes::CD) in " +
			"value.code = '1946603' and value.codeSystem = '2.16.840.1.113883.6.96')))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurotoxicityImpairmentofADLs The receiving '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNeurotoxicityImpairmentofADLs());
			try {
				VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				neurotoxicityImpairmentofADLs)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION_VALUE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NeurotoxicityImpairmentofADLsNeurotoxicityImpairmentofADLsEntryRelationshipObservationValue",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										neurotoxicityImpairmentofADLs, context) }),
						new Object[] { neurotoxicityImpairmentofADLs }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(isDefined('typeCode'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurotoxicityImpairmentofADLs The receiving '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNeurotoxicityImpairmentofADLs());
			try {
				VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				neurotoxicityImpairmentofADLs)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_TYPE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NeurotoxicityImpairmentofADLsNeurotoxicityImpairmentofADLsEntryRelationshipTypeCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										neurotoxicityImpairmentofADLs, context) }),
						new Object[] { neurotoxicityImpairmentofADLs }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservation(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservation(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cda::Observation)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservation(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Neurotoxicity Impairmentof AD Ls Entry Relationship Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNeurotoxicityImpairmentofADLsEntryRelationshipObservation(NeurotoxicityImpairmentofADLs, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param neurotoxicityImpairmentofADLs The receiving '<em><b>Neurotoxicity Impairmentof AD Ls</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNeurotoxicityImpairmentofADLsEntryRelationshipObservation(
			NeurotoxicityImpairmentofADLs neurotoxicityImpairmentofADLs, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CLONDATAPackage.eINSTANCE.getNeurotoxicityImpairmentofADLs());
			try {
				VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				neurotoxicityImpairmentofADLs)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CLONDATAValidator.DIAGNOSTIC_SOURCE,
						CLONDATAValidator.NEUROTOXICITY_IMPAIRMENTOF_AD_LS__NEUROTOXICITY_IMPAIRMENTOF_AD_LS_ENTRY_RELATIONSHIP_OBSERVATION,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"NeurotoxicityImpairmentofADLsNeurotoxicityImpairmentofADLsEntryRelationshipObservation",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										neurotoxicityImpairmentofADLs, context) }),
						new Object[] { neurotoxicityImpairmentofADLs }));
			}

			return false;
		}
		return true;
	}

} // NeurotoxicityImpairmentofADLsOperations
