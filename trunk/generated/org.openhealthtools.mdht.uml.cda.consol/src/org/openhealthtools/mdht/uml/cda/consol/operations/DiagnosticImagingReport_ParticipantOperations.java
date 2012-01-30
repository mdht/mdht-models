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
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_Participant;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.Participant1Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Diagnostic Imaging Report Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_Participant#validateParticipantAssociatedEntity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Participant Associated Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagnosticImagingReport_ParticipantOperations extends Participant1Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticImagingReport_ParticipantOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateParticipantAssociatedEntity(DiagnosticImagingReport_Participant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Participant Associated Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateParticipantAssociatedEntity(DiagnosticImagingReport_Participant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity))";

	/**
	 * The cached OCL invariant for the '{@link #validateParticipantAssociatedEntity(DiagnosticImagingReport_Participant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Participant Associated Entity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateParticipantAssociatedEntity(DiagnosticImagingReport_Participant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.associatedEntity->one(associatedEntity : cda::AssociatedEntity | not associatedEntity.oclIsUndefined() and associatedEntity.oclIsKindOf(cda::AssociatedEntity))
	 * @param diagnosticImagingReport_Participant The receiving '<em><b>Diagnostic Imaging Report Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateParticipantAssociatedEntity(
			DiagnosticImagingReport_Participant diagnosticImagingReport_Participant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT);
			try {
				VALIDATE_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PARTICIPANT_ASSOCIATED_ENTITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			diagnosticImagingReport_Participant)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.DIAGNOSTIC_IMAGING_REPORT_PARTICIPANT__PARTICIPANT_ASSOCIATED_ENTITY,
					ConsolPlugin.INSTANCE.getString("ParticipantAssociatedEntity"),
					new Object[] { diagnosticImagingReport_Participant }));
			}
			return false;
		}
		return true;
	}

} // DiagnosticImagingReport_ParticipantOperations
