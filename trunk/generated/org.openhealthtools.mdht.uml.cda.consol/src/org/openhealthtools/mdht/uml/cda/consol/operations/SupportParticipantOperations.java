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
import org.openhealthtools.mdht.uml.cda.consol.SupportParticipant;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Support Participant</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.SupportParticipant#validateSupportParticipantTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Participant Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SupportParticipantOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportParticipantOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSupportParticipantTemplateId(SupportParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Participant Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportParticipantTemplateId(SupportParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SUPPORT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateSupportParticipantTemplateId(SupportParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Support Participant Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSupportParticipantTemplateId(SupportParticipant, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_SUPPORT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.3')
	 * @param supportParticipant The receiving '<em><b>Support Participant</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateSupportParticipantTemplateId(SupportParticipant supportParticipant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_SUPPORT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.SUPPORT_PARTICIPANT);
			try {
				VALIDATE_SUPPORT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SUPPORT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SUPPORT_PARTICIPANT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(supportParticipant)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.SUPPORT_PARTICIPANT__SUPPORT_PARTICIPANT_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("SupportParticipantTemplateId"),
						 new Object [] { supportParticipant }));
			}
			return false;
		}
		return true;
	}

} // SupportParticipantOperations