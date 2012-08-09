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

import org.openhealthtools.mdht.uml.cda.consol.PostprocedureDiagnosis;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.PostprocedureDiagnosisSection;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.PostprocedureDiagnosisSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Postprocedure Diagnosis Section</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class PostprocedureDiagnosisSectionImpl
		extends
		org.openhealthtools.mdht.uml.cda.consol.impl.PostprocedureDiagnosisSectionImpl
		implements PostprocedureDiagnosisSection {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected PostprocedureDiagnosisSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.POSTPROCEDURE_DIAGNOSIS_SECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PostprocedureDiagnosisSectionOperations
				.validateMu2consolPostprocedureDiagnosisSectionPostprocedureDiagnosis(
						this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public PostprocedureDiagnosis getmu2consolPostprocedureDiagnosis() {
		return PostprocedureDiagnosisSectionOperations
				.getmu2consolPostprocedureDiagnosis(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public PostprocedureDiagnosisSection init() {
		CDAUtil.init(this);
		return this;
	}
} // PostprocedureDiagnosisSectionImpl
