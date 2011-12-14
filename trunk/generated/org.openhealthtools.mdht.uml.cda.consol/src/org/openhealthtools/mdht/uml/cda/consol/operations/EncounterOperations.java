/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.Encounter;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Encounter#validateConsolEncounterAdmissionSourceValueSet(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Admission Source Value Set</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Encounter#validateConsolEncounterClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Encounter#validateConsolEncounterId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Encounter#validateConsolEncounterCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.Encounter#validateConsolEncounterText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncounterOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncounterOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolEncounterAdmissionSourceValueSet(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Admission Source Value Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolEncounterAdmissionSourceValueSet(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->select( par : cda::Participant2 | par.typeCode = vocab::ParticipationType::ORG )->forAll( par : cda::Participant2 | par.participantRole->one(pr : cda::ParticipantRole | pr.code.codeSystem = '2.16.840.1.113883.3.88.12.80.33') )";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolEncounterAdmissionSourceValueSet(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Admission Source Value Set</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolEncounterAdmissionSourceValueSet(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.participant->select( par : cda::Participant2 | par.typeCode = vocab::ParticipationType::ORG )->forAll( par : cda::Participant2 | par.participantRole->one(pr : cda::ParticipantRole | pr.code.codeSystem = '2.16.840.1.113883.3.88.12.80.33') )
	 * @param encounter The receiving '<em><b>Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolEncounterAdmissionSourceValueSet(Encounter encounter,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_CONSOL_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER);
			try {
				VALIDATE_CONSOL_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounter)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER__CONSOL_ENCOUNTER_ADMISSION_SOURCE_VALUE_SET,
						 ConsolPlugin.INSTANCE.getString("ConsolEncounterAdmissionSourceValueSet"),
						 new Object [] { encounter }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolEncounterClassCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolEncounterClassCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClass::ENC";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolEncounterClassCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolEncounterClassCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::ActClass::ENC
	 * @param encounter The receiving '<em><b>Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolEncounterClassCode(Encounter encounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONSOL_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER);
			try {
				VALIDATE_CONSOL_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_ENCOUNTER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounter)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER__CONSOL_ENCOUNTER_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("ConsolEncounterClassCode"),
						 new Object [] { encounter }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolEncounterId(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolEncounterId(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolEncounterId(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolEncounterId(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param encounter The receiving '<em><b>Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolEncounterId(Encounter encounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONSOL_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER);
			try {
				VALIDATE_CONSOL_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_ENCOUNTER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounter)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER__CONSOL_ENCOUNTER_ID,
						 ConsolPlugin.INSTANCE.getString("ConsolEncounterId"),
						 new Object [] { encounter }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolEncounterCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolEncounterCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("+
"value.codeSystem = '2.16.840.1.113883.6.12' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolEncounterCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolEncounterCode(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.6.12' and not value.code.oclIsUndefined()))
	 * @param encounter The receiving '<em><b>Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolEncounterCode(Encounter encounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONSOL_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER);
			try {
				VALIDATE_CONSOL_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounter)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER__CONSOL_ENCOUNTER_CODE,
						 ConsolPlugin.INSTANCE.getString("ConsolEncounterCode"),
						 new Object [] { encounter }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConsolEncounterText(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolEncounterText(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONSOL_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConsolEncounterText(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Consol Encounter Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConsolEncounterText(Encounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_CONSOL_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param encounter The receiving '<em><b>Encounter</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateConsolEncounterText(Encounter encounter, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_CONSOL_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTER);
			try {
				VALIDATE_CONSOL_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONSOL_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONSOL_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encounter)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOUNTER__CONSOL_ENCOUNTER_TEXT,
						 ConsolPlugin.INSTANCE.getString("ConsolEncounterText"),
						 new Object [] { encounter }));
			}
			return false;
		}
		return true;
	}

} // EncounterOperations
