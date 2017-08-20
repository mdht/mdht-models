/**
 */
package org.hl7.cbcc.privacy.consentdirective.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.cda.operations.OrganizerOperations;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPackage;
import org.hl7.cbcc.privacy.consentdirective.CONSENTDIRECTIVEPlugin;
import org.hl7.cbcc.privacy.consentdirective.SecurityLabel;

import org.hl7.cbcc.privacy.consentdirective.util.CONSENTDIRECTIVEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Security Label</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SecurityLabel#validateSecurityLabelTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Label Template Id</em>}</li>
 *   <li>{@link org.hl7.cbcc.privacy.consentdirective.SecurityLabel#validateSecurityLabelComponent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Label Component</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityLabelOperations extends OrganizerOperations {
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
	protected SecurityLabelOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSecurityLabelTemplateId(SecurityLabel, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Label Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityLabelTemplateId(SecurityLabel, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SECURITY_LABEL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.445.24')";

	/**
	 * The cached OCL invariant for the '{@link #validateSecurityLabelTemplateId(SecurityLabel, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Label Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityLabelTemplateId(SecurityLabel, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SECURITY_LABEL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param securityLabel The receiving '<em><b>Security Label</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSecurityLabelTemplateId(SecurityLabel securityLabel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SECURITY_LABEL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SECURITY_LABEL);
			try {
				VALIDATE_SECURITY_LABEL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SECURITY_LABEL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SECURITY_LABEL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(securityLabel)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.SECURITY_LABEL__SECURITY_LABEL_TEMPLATE_ID,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("SecurityLabelSecurityLabelTemplateId"),
						new Object[] { securityLabel }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSecurityLabelComponent(SecurityLabel, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Label Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityLabelComponent(SecurityLabel, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SECURITY_LABEL_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->exists(component : cda::Component4 | not component.oclIsUndefined() and component.oclIsKindOf(consentdirective::SecurityObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateSecurityLabelComponent(SecurityLabel, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Security Label Component</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSecurityLabelComponent(SecurityLabel, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SECURITY_LABEL_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param securityLabel The receiving '<em><b>Security Label</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSecurityLabelComponent(SecurityLabel securityLabel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_SECURITY_LABEL_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CONSENTDIRECTIVEPackage.Literals.SECURITY_LABEL);
			try {
				VALIDATE_SECURITY_LABEL_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SECURITY_LABEL_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_SECURITY_LABEL_COMPONENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			securityLabel)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CONSENTDIRECTIVEValidator.DIAGNOSTIC_SOURCE,
						CONSENTDIRECTIVEValidator.SECURITY_LABEL__SECURITY_LABEL_COMPONENT,
						CONSENTDIRECTIVEPlugin.INSTANCE.getString("SecurityLabelSecurityLabelComponent"),
						new Object[] { securityLabel }));
			}

			return false;
		}
		return true;
	}

} // SecurityLabelOperations
