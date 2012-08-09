/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosis;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PreoperativeDiagnosisSection;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.PreoperativeDiagnosisSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Preoperative Diagnosis Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class PreoperativeDiagnosisSectionImpl
		extends
		org.openhealthtools.mdht.uml.cda.consol.impl.PreoperativeDiagnosisSectionImpl
		implements PreoperativeDiagnosisSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PreoperativeDiagnosisSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.PREOPERATIVE_DIAGNOSIS_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PreoperativeDiagnosisSectionOperations
				.validateMu2consolPreoperativeDiagnosisSectionPreoperativeDiagnosis(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PreoperativeDiagnosis getmu2consolPreoperativeDiagnosis() {
		return PreoperativeDiagnosisSectionOperations
				.getmu2consolPreoperativeDiagnosis(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PreoperativeDiagnosisSection init() {
		CDAUtil.init(this);
		return this;
	}
} // PreoperativeDiagnosisSectionImpl
