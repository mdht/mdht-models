/*******************************************************************************
 * Copyright (c) 2009, 2011 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.Immunization;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunization</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Immunization#validateHITSPImmunizationRefusalReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunization Refusal Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Immunization#validateHITSPImmunizationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunization Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.Immunization#validateImmunizationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationOperations extends org.openhealthtools.mdht.uml.cda.ihe.operations.ImmunizationOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPImmunizationRefusalReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunization Refusal Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPImmunizationRefusalReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->select(er | er.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON and (not er.act.oclIsUndefined()) and (not er.act.code.oclIsUndefined() and  not er.act.code.codeSystem.oclIsUndefined() and er.act.code.codeSystem = '2.16.840.1.113883.1.11.19717')  )->isEmpty()";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPImmunizationRefusalReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunization Refusal Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPImmunizationRefusalReason(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->select(er | er.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON and (not er.act.oclIsUndefined()) and (not er.act.code.oclIsUndefined() and  not er.act.code.codeSystem.oclIsUndefined() and er.act.code.codeSystem = '2.16.840.1.113883.1.11.19717')  )->isEmpty()
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHITSPImmunizationRefusalReason(Immunization immunization,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HITSP_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_HITSP_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_IMMUNIZATION_REFUSAL_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.IMMUNIZATION__HITSP_IMMUNIZATION_REFUSAL_REASON,
					HITSPPlugin.INSTANCE.getString("HITSPImmunizationRefusalReason"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPImmunizationTemplateId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunization Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPImmunizationTemplateId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPImmunizationTemplateId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Immunization Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPImmunizationTemplateId(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.13')
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHITSPImmunizationTemplateId(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_HITSP_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_HITSP_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_IMMUNIZATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.IMMUNIZATION__HITSP_IMMUNIZATION_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("HITSPImmunizationTemplateId"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.codeSystem = '2.16.840.1.113883.12.292' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunization Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationCode(Immunization, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.codeSystem = '2.16.840.1.113883.12.292' and not value.code.oclIsUndefined()))
	 * @param immunization The receiving '<em><b>Immunization</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateImmunizationCode(Immunization immunization, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.IMMUNIZATION);
			try {
				VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunization)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE, HITSPValidator.IMMUNIZATION__IMMUNIZATION_CODE,
					HITSPPlugin.INSTANCE.getString("ImmunizationCode"), new Object[] { immunization }));
			}
			return false;
		}
		return true;
	}

} // ImmunizationOperations