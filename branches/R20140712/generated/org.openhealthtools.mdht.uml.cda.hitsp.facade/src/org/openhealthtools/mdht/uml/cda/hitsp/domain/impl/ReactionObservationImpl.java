/*******************************************************************************
 * Copyright (c) 2011, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.domain.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IReactionObservation;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ISeverityObservation;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.ReactionObservationImpl#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReactionObservationImpl extends EObjectImpl implements IReactionObservation {
	/**
	 * The cached value of the '{@link #getCDAType() <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDAType()
	 * @generated
	 * @ordered
	 */
	protected Observation cDAType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactionObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDomainPackage.eINSTANCE.getReactionObservation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observation getCDAType() {
		if (cDAType != null && cDAType.eIsProxy()) {
			InternalEObject oldCDAType = (InternalEObject) cDAType;
			cDAType = (Observation) eResolveProxy(oldCDAType);
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
	public Observation basicGetCDAType() {
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDAType(Observation newCDAType) {
		cDAType = newCDAType;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCode() <em>Get Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CODE__EOCL_EXP = "self.code.oclAsType(datatypes::CD)";

	/**
	 * The cached OCL query for the '{@link #getCode() <em>Get Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getCode() {
		if (GET_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReactionObservation(),
				IDomainPackage.eINSTANCE.getReactionObservation().getEAllOperations().get(0));
			try {
				GET_CODE__EOCL_QRY = helper.createQuery(GET_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CODE__EOCL_QRY);
		return (CD) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD withCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CD value = (CD) eObject;
		this.getCDAType().setCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReactionObservation setCode(CD value) {
		this.getCDAType().setCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSeverityObservation() <em>Get Severity Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SEVERITY_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::SeverityObservation))->asSequence()->first().oclAsType(domain::SeverityObservation)";

	/**
	 * The cached OCL query for the '{@link #getSeverityObservation() <em>Get Severity Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverityObservation()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SEVERITY_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverityObservation getSeverityObservation() {
		if (GET_SEVERITY_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getReactionObservation(),
				IDomainPackage.eINSTANCE.getReactionObservation().getEAllOperations().get(3));
			try {
				GET_SEVERITY_OBSERVATION__EOCL_QRY = helper.createQuery(GET_SEVERITY_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SEVERITY_OBSERVATION__EOCL_QRY);
		return (ISeverityObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISeverityObservation withSeverityObservation() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("SeverityObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("SeverityObservation");
		ISeverityObservation value = (ISeverityObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReactionObservation setSeverityObservation(ISeverityObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
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
			case IDomainPackage.REACTION_OBSERVATION__CDA_TYPE:
				if (resolve) {
					return getCDAType();
				}
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
			case IDomainPackage.REACTION_OBSERVATION__CDA_TYPE:
				setCDAType((Observation) newValue);
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
			case IDomainPackage.REACTION_OBSERVATION__CDA_TYPE:
				setCDAType((Observation) null);
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
			case IDomainPackage.REACTION_OBSERVATION__CDA_TYPE:
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
	public IReactionObservation init() {
		CDAUtil.init(this);
		return this;
	}
} // ReactionObservationImpl
