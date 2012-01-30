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

import org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.EncompassingEncounterOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Component Of Encompassing Encounter7</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7#validateEncompassingEncounter7EffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7#validateEncompassingEncounter7Id(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7#validateEncompassingEncounter7PhysicianofRecordParticipant(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Physicianof Record Participant</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ComponentOf_EncompassingEncounter7#validateEncompassingEncounter7ResponsibleParty(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Responsible Party</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentOf_EncompassingEncounter7Operations extends EncompassingEncounterOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentOf_EncompassingEncounter7Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter7EffectiveTime(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter7EffectiveTime(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter7EffectiveTime(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter7EffectiveTime(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
	 * @param componentOf_EncompassingEncounter7 The receiving '<em><b>Component Of Encompassing Encounter7</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter7EffectiveTime(
			ComponentOf_EncompassingEncounter7 componentOf_EncompassingEncounter7, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER7);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			componentOf_EncompassingEncounter7)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER7__ENCOMPASSING_ENCOUNTER7_EFFECTIVE_TIME,
					ConsolPlugin.INSTANCE.getString("EncompassingEncounter7EffectiveTime"),
					new Object[] { componentOf_EncompassingEncounter7 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter7Id(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter7Id(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter7Id(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter7Id(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param componentOf_EncompassingEncounter7 The receiving '<em><b>Component Of Encompassing Encounter7</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter7Id(
			ComponentOf_EncompassingEncounter7 componentOf_EncompassingEncounter7, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER7);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER7_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			componentOf_EncompassingEncounter7)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER7__ENCOMPASSING_ENCOUNTER7_ID,
					ConsolPlugin.INSTANCE.getString("EncompassingEncounter7Id"),
					new Object[] { componentOf_EncompassingEncounter7 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter7PhysicianofRecordParticipant(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Physicianof Record Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter7PhysicianofRecordParticipant(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(consol::PhysicianofRecordParticipant))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter7PhysicianofRecordParticipant(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Physicianof Record Participant</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter7PhysicianofRecordParticipant(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.encounterParticipant->one(encounterParticipant : cda::EncounterParticipant | not encounterParticipant.oclIsUndefined() and encounterParticipant.oclIsKindOf(consol::PhysicianofRecordParticipant))
	 * @param componentOf_EncompassingEncounter7 The receiving '<em><b>Component Of Encompassing Encounter7</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter7PhysicianofRecordParticipant(
			ComponentOf_EncompassingEncounter7 componentOf_EncompassingEncounter7, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER7);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			componentOf_EncompassingEncounter7)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER7__ENCOMPASSING_ENCOUNTER7_PHYSICIANOF_RECORD_PARTICIPANT,
					ConsolPlugin.INSTANCE.getString("EncompassingEncounter7PhysicianofRecordParticipant"),
					new Object[] { componentOf_EncompassingEncounter7 }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncompassingEncounter7ResponsibleParty(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Responsible Party</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter7ResponsibleParty(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncompassingEncounter7ResponsibleParty(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encompassing Encounter7 Responsible Party</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncompassingEncounter7ResponsibleParty(ComponentOf_EncompassingEncounter7, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.responsibleParty->one(responsibleParty : cda::ResponsibleParty | not responsibleParty.oclIsUndefined() and responsibleParty.oclIsKindOf(cda::ResponsibleParty))
	 * @param componentOf_EncompassingEncounter7 The receiving '<em><b>Component Of Encompassing Encounter7</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncompassingEncounter7ResponsibleParty(
			ComponentOf_EncompassingEncounter7 componentOf_EncompassingEncounter7, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.COMPONENT_OF_ENCOMPASSING_ENCOUNTER7);
			try {
				VALIDATE_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			componentOf_EncompassingEncounter7)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.COMPONENT_OF_ENCOMPASSING_ENCOUNTER7__ENCOMPASSING_ENCOUNTER7_RESPONSIBLE_PARTY,
					ConsolPlugin.INSTANCE.getString("EncompassingEncounter7ResponsibleParty"),
					new Object[] { componentOf_EncompassingEncounter7 }));
			}
			return false;
		}
		return true;
	}

} // ComponentOf_EncompassingEncounter7Operations
