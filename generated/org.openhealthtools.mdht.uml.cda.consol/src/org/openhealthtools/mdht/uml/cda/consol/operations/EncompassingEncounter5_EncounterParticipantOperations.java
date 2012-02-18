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
import org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter5_EncounterParticipant;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.hl7.rim.operations.ParticipationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encompassing Encounter5 Encounter Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncompassingEncounter5_EncounterParticipant#validateEncounterParticipantTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Participant Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncompassingEncounter5_EncounterParticipantOperations extends ParticipationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncompassingEncounter5_EncounterParticipantOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncounterParticipantTypeCode(EncompassingEncounter5_EncounterParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Participant Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterParticipantTypeCode(EncompassingEncounter5_EncounterParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::x_EncounterParticipant::REF";

	/**
	 * The cached OCL invariant for the '{@link #validateEncounterParticipantTypeCode(EncompassingEncounter5_EncounterParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounter Participant Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncounterParticipantTypeCode(EncompassingEncounter5_EncounterParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeCode=vocab::x_EncounterParticipant::REF
	 * @param encompassingEncounter5_EncounterParticipant The receiving '<em><b>Encompassing Encounter5 Encounter Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncounterParticipantTypeCode(
			EncompassingEncounter5_EncounterParticipant encompassingEncounter5_EncounterParticipant,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT);
			try {
				VALIDATE_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTER_PARTICIPANT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(encompassingEncounter5_EncounterParticipant)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.ENCOMPASSING_ENCOUNTER5_ENCOUNTER_PARTICIPANT__ENCOUNTER_PARTICIPANT_TYPE_CODE,
						 ConsolPlugin.INSTANCE.getString("EncounterParticipantTypeCode"),
						 new Object [] { encompassingEncounter5_EncounterParticipant }));
			}
			return false;
		}
		return true;
	}

} // EncompassingEncounter5_EncounterParticipantOperations
