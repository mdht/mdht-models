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
import org.openhealthtools.mdht.uml.cda.consol.ParticipantSupport;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.operations.Participant1Operations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Participant Support</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ParticipantSupport#validateParticipantSupportTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Participant Support Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantSupportOperations extends Participant1Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantSupportOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateParticipantSupportTime(ParticipantSupport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Participant Support Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateParticipantSupportTime(ParticipantSupport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateParticipantSupportTime(ParticipantSupport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Participant Support Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateParticipantSupportTime(ParticipantSupport, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.time.oclIsUndefined() or self.time.isNullFlavorUndefined()) implies (not self.time.oclIsUndefined())
	 * @param participantSupport The receiving '<em><b>Participant Support</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateParticipantSupportTime(ParticipantSupport participantSupport,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.PARTICIPANT_SUPPORT);
			try {
				VALIDATE_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PARTICIPANT_SUPPORT_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			participantSupport)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.PARTICIPANT_SUPPORT__PARTICIPANT_SUPPORT_TIME,
					ConsolPlugin.INSTANCE.getString("ParticipantSupportTime"), new Object[] { participantSupport }));
			}
			return false;
		}
		return true;
	}

} // ParticipantSupportOperations
