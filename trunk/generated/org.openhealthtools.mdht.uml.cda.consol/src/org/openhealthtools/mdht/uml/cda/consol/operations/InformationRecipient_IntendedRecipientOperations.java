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
import org.openhealthtools.mdht.uml.cda.consol.InformationRecipient_IntendedRecipient;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.hl7.rim.operations.RoleOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Information Recipient Intended Recipient</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InformationRecipient_IntendedRecipient#validateIntendedRecipientInformationRecipient(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intended Recipient Information Recipient</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InformationRecipient_IntendedRecipient#validateIntendedRecipientRecievedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intended Recipient Recieved Organization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InformationRecipient_IntendedRecipientOperations extends RoleOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationRecipient_IntendedRecipientOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIntendedRecipientInformationRecipient(InformationRecipient_IntendedRecipient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intended Recipient Information Recipient</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIntendedRecipientInformationRecipient(InformationRecipient_IntendedRecipient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person))";

	/**
	 * The cached OCL invariant for the '{@link #validateIntendedRecipientInformationRecipient(InformationRecipient_IntendedRecipient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intended Recipient Information Recipient</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIntendedRecipientInformationRecipient(InformationRecipient_IntendedRecipient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.informationRecipient->one(informationRecipient : cda::Person | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::Person))
	 * @param informationRecipient_IntendedRecipient The receiving '<em><b>Information Recipient Intended Recipient</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIntendedRecipientInformationRecipient(
			InformationRecipient_IntendedRecipient informationRecipient_IntendedRecipient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INFORMATION_RECIPIENT_INTENDED_RECIPIENT);
			try {
				VALIDATE_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTENDED_RECIPIENT_INFORMATION_RECIPIENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(informationRecipient_IntendedRecipient)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INFORMATION_RECIPIENT_INTENDED_RECIPIENT__INTENDED_RECIPIENT_INFORMATION_RECIPIENT,
						 ConsolPlugin.INSTANCE.getString("IntendedRecipientInformationRecipient"),
						 new Object [] { informationRecipient_IntendedRecipient }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateIntendedRecipientRecievedOrganization(InformationRecipient_IntendedRecipient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intended Recipient Recieved Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIntendedRecipientRecievedOrganization(InformationRecipient_IntendedRecipient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(cda::Organization))";

	/**
	 * The cached OCL invariant for the '{@link #validateIntendedRecipientRecievedOrganization(InformationRecipient_IntendedRecipient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Intended Recipient Recieved Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateIntendedRecipientRecievedOrganization(InformationRecipient_IntendedRecipient, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.receivedOrganization->one(receivedOrganization : cda::Organization | not receivedOrganization.oclIsUndefined() and receivedOrganization.oclIsKindOf(cda::Organization))
	 * @param informationRecipient_IntendedRecipient The receiving '<em><b>Information Recipient Intended Recipient</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateIntendedRecipientRecievedOrganization(
			InformationRecipient_IntendedRecipient informationRecipient_IntendedRecipient, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INFORMATION_RECIPIENT_INTENDED_RECIPIENT);
			try {
				VALIDATE_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INTENDED_RECIPIENT_RECIEVED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(informationRecipient_IntendedRecipient)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.INFORMATION_RECIPIENT_INTENDED_RECIPIENT__INTENDED_RECIPIENT_RECIEVED_ORGANIZATION,
						 ConsolPlugin.INSTANCE.getString("IntendedRecipientRecievedOrganization"),
						 new Object [] { informationRecipient_IntendedRecipient }));
			}
			return false;
		}
		return true;
	}

} // InformationRecipient_IntendedRecipientOperations
