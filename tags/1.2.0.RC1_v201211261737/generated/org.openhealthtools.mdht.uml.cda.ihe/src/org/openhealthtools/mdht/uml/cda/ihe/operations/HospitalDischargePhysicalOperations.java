/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargePhysical;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Physical</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargePhysical#validateHospitalDischargePhysicalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.HospitalDischargePhysical#validateHospitalDischargePhysicalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalDischargePhysicalOperations extends SectionOperations {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected HospitalDischargePhysicalOperations() {
		super();
	}

	/**
	* The cached OCL expression body for the '{@link #validateHospitalDischargePhysicalTemplateId(HospitalDischargePhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Template Id</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargePhysicalTemplateId(HospitalDischargePhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.3.26')";

	/**
	* The cached OCL invariant for the '{@link #validateHospitalDischargePhysicalTemplateId(HospitalDischargePhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Template Id</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargePhysicalTemplateId(HospitalDischargePhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param hospitalDischargePhysical The receiving '<em><b>Hospital Discharge Physical</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHospitalDischargePhysicalTemplateId(
			HospitalDischargePhysical hospitalDischargePhysical, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.HOSPITAL_DISCHARGE_PHYSICAL);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargePhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.HOSPITAL_DISCHARGE_PHYSICAL__HOSPITAL_DISCHARGE_PHYSICAL_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("HospitalDischargePhysicalTemplateId"),
					new Object[] { hospitalDischargePhysical }));
			}

			return false;
		}
		return true;
	}

	/**
	* The cached OCL expression body for the '{@link #validateHospitalDischargePhysicalCode(HospitalDischargePhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Code</em>}' operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargePhysicalCode(HospitalDischargePhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '10184-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	* The cached OCL invariant for the '{@link #validateHospitalDischargePhysicalCode(HospitalDischargePhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Physical Code</em>}' invariant operation.
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @see #validateHospitalDischargePhysicalCode(HospitalDischargePhysical, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	* @generated
	* @ordered
	*/
	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* <!-- begin-model-doc -->
	* @param hospitalDischargePhysical The receiving '<em><b>Hospital Discharge Physical</b></em>' model object.
	* @param diagnostics The chain of diagnostics to which problems are to be appended.
	* @param context The cache of context-specific information.
	* <!-- end-model-doc -->
	* @generated
	*/
	public static boolean validateHospitalDischargePhysicalCode(HospitalDischargePhysical hospitalDischargePhysical,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.HOSPITAL_DISCHARGE_PHYSICAL);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_DISCHARGE_PHYSICAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargePhysical)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.HOSPITAL_DISCHARGE_PHYSICAL__HOSPITAL_DISCHARGE_PHYSICAL_CODE,
					IHEPlugin.INSTANCE.getString("HospitalDischargePhysicalCode"),
					new Object[] { hospitalDischargePhysical }));
			}

			return false;
		}
		return true;
	}

} // HospitalDischargePhysicalOperations
