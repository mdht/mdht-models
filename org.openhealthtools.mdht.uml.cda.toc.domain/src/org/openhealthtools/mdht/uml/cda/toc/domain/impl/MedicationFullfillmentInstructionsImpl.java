/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationFullfillmentInstructions;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.ED;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Fullfillment Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.MedicationFullfillmentInstructionsImpl#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationFullfillmentInstructionsImpl extends EObjectImpl implements IMedicationFullfillmentInstructions {
	/**
	 * The cached value of the '{@link #getCDAType() <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDAType()
	 * @generated
	 * @ordered
	 */
	protected Act cDAType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationFullfillmentInstructionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDomainPackage.eINSTANCE.getMedicationFullfillmentInstructions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Act getCDAType() {
		if (cDAType != null && cDAType.eIsProxy()) {
			InternalEObject oldCDAType = (InternalEObject)cDAType;
			cDAType = (Act)eResolveProxy(oldCDAType);
			if (cDAType != oldCDAType) {
			}
		}
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Act basicGetCDAType() {
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDAType(Act newCDAType) {
		cDAType = newCDAType;
	}

	/**
	 * The cached OCL expression body for the '{@link #getText() <em>Get Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TEXT__EOCL_EXP = "self.text.oclAsType(datatypes::ED)";

	/**
	 * The cached OCL query for the '{@link #getText() <em>Get Text</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TEXT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED getText() {
		if (GET_TEXT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getMedicationFullfillmentInstructions(), IDomainPackage.eINSTANCE.getMedicationFullfillmentInstructions().getEAllOperations().get(0));
			try {
				GET_TEXT__EOCL_QRY = helper.createQuery(GET_TEXT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TEXT__EOCL_QRY);
		return (ED) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ED withText() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ED");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ED value = (ED) eObject;
		this.getCDAType().setText(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationFullfillmentInstructions setText(ED value) {
		this.getCDAType().setText(value);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDomainPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS__CDA_TYPE:
				if (resolve) return getCDAType();
				return basicGetCDAType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IDomainPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS__CDA_TYPE:
				setCDAType((Act)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IDomainPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS__CDA_TYPE:
				setCDAType((Act)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IDomainPackage.MEDICATION_FULLFILLMENT_INSTRUCTIONS__CDA_TYPE:
				return cDAType != null;
		}
		return super.eIsSet(featureID);
	}

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
	public IMedicationFullfillmentInstructions init() {
    	CDAUtil.init(this);
    	return this;
	}
} // MedicationFullfillmentInstructionsImpl
