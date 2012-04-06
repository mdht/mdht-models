/**
 * Copyright (C) 2009, OFFIS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * This software and supporting documentation were developed by
 * 
 *   OFFIS e.V.
 *   Escherweg 2, 26121 Oldenburg
 *  
 * THIS SOFTWARE IS MADE AVAILABLE,  AS IS,  AND OFFIS 
 * MAKES NO  WARRANTY REGARDING  THE  SOFTWARE,  ITS  PERFORMANCE,  ITS  
 * MERCHANTABILITY  OR FITNESS FOR ANY PARTICULAR USE, FREEDOM FROM ANY 
 * COMPUTER DISEASES  OR ITS CONFORMITY TO ANY SPECIFICATION. THE ENTIRE RISK 
 * AS TO QUALITY AND PERFORMANCE OF THE SOFTWARE IS WITH THE USER.
 *  
 * Author:  "Myriam Lipprandt <myriam.lipprandt@offis.de>", OFFIS e.V.
 * Date: 2011-12-14
 * 
 */
package org.openhealthtools.mdht.uml.cda.phmr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.Participant2Operations;

import org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstanceReference;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPackage;
import org.openhealthtools.mdht.uml.cda.phmr.PhmrPlugin;

import org.openhealthtools.mdht.uml.cda.phmr.util.PhmrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>PHMR Product Instance Reference</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstanceReference#validatePHMRProductInstanceReferenceTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Reference Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phmr.PHMRProductInstanceReference#validatePHMRProductInstanceReferenceTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Reference Type Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PHMRProductInstanceReferenceOperations extends Participant2Operations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PHMRProductInstanceReferenceOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePHMRProductInstanceReferenceTemplateId(PHMRProductInstanceReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Reference Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstanceReferenceTemplateId(PHMRProductInstanceReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = 'null')";

	/**
	 * The cached OCL invariant for the '{@link #validatePHMRProductInstanceReferenceTemplateId(PHMRProductInstanceReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Reference Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstanceReferenceTemplateId(PHMRProductInstanceReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = 'null')
	 * @param phmrProductInstanceReference The receiving '<em><b>PHMR Product Instance Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePHMRProductInstanceReferenceTemplateId(PHMRProductInstanceReference phmrProductInstanceReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.PHMR_PRODUCT_INSTANCE_REFERENCE);
			try {
				VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phmrProductInstanceReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.PHMR_PRODUCT_INSTANCE_REFERENCE__PHMR_PRODUCT_INSTANCE_REFERENCE_TEMPLATE_ID,
						 PhmrPlugin.INSTANCE.getString("PHMRProductInstanceReferenceTemplateId"),
						 new Object [] { phmrProductInstanceReference }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePHMRProductInstanceReferenceTypeCode(PHMRProductInstanceReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Reference Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstanceReferenceTypeCode(PHMRProductInstanceReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeCode=vocab::ParticipationType::SBJ";

	/**
	 * The cached OCL invariant for the '{@link #validatePHMRProductInstanceReferenceTypeCode(PHMRProductInstanceReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate PHMR Product Instance Reference Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePHMRProductInstanceReferenceTypeCode(PHMRProductInstanceReference, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.typeCode=vocab::ParticipationType::SBJ
	 * @param phmrProductInstanceReference The receiving '<em><b>PHMR Product Instance Reference</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validatePHMRProductInstanceReferenceTypeCode(PHMRProductInstanceReference phmrProductInstanceReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PhmrPackage.Literals.PHMR_PRODUCT_INSTANCE_REFERENCE);
			try {
				VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHMR_PRODUCT_INSTANCE_REFERENCE_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(phmrProductInstanceReference)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PhmrValidator.DIAGNOSTIC_SOURCE,
						 PhmrValidator.PHMR_PRODUCT_INSTANCE_REFERENCE__PHMR_PRODUCT_INSTANCE_REFERENCE_TYPE_CODE,
						 PhmrPlugin.INSTANCE.getString("PHMRProductInstanceReferenceTypeCode"),
						 new Object [] { phmrProductInstanceReference }));
			}
			return false;
		}
		return true;
	}

} // PHMRProductInstanceReferenceOperations