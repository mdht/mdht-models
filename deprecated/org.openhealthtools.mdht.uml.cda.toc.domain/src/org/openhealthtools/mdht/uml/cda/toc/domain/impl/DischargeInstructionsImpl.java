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
package org.openhealthtools.mdht.uml.cda.toc.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAdvanceDirectivesSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeInstructions;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.toc.domain.IImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicalEquipmentSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemListSection;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Instructions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.DischargeInstructionsImpl#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeInstructionsImpl extends EObjectImpl implements IDischargeInstructions {
	/**
	 * The cached value of the '{@link #getCDAType() <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDAType()
	 * @generated
	 * @ordered
	 */
	protected ClinicalDocument cDAType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeInstructionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDomainPackage.eINSTANCE.getDischargeInstructions();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalDocument getCDAType() {
		if (cDAType != null && cDAType.eIsProxy()) {
			InternalEObject oldCDAType = (InternalEObject) cDAType;
			cDAType = (ClinicalDocument) eResolveProxy(oldCDAType);
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
	public ClinicalDocument basicGetCDAType() {
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDAType(ClinicalDocument newCDAType) {
		cDAType = newCDAType;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAuthors() <em>Get Authors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AUTHORS__EOCL_EXP = "self.getAuthors()->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author)).oclAsType(cda::Author)";

	/**
	 * The cached OCL query for the '{@link #getAuthors() <em>Get Authors</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AUTHORS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Author> getAuthors() {
		if (GET_AUTHORS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(24));
			try {
				GET_AUTHORS__EOCL_QRY = helper.createQuery(GET_AUTHORS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AUTHORS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Author> result = (Collection<Author>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<Author>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author addAuthor() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Author");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Author value = (Author) eObject;
		this.getCDAType().getAuthors().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions addAuthor(Author value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getCustodian() <em>Get Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CUSTODIAN__EOCL_EXP = "self.getCustodians()->select(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))->asSequence()->first().oclAsType(cda::Custodian)";

	/**
	 * The cached OCL query for the '{@link #getCustodian() <em>Get Custodian</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CUSTODIAN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian getCustodian() {
		if (GET_CUSTODIAN__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(27));
			try {
				GET_CUSTODIAN__EOCL_QRY = helper.createQuery(GET_CUSTODIAN__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CUSTODIAN__EOCL_QRY);
		return (Custodian) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian withCustodian() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Custodian");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Custodian value = (Custodian) eObject;
		this.getCDAType().setCustodian(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setCustodian(Custodian value) {
		this.getCDAType().setCustodian(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTypeId() <em>Get Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TYPE_ID__EOCL_EXP = "self.typeId.oclAsType(cda::InfrastructureRootTypeId)";

	/**
	 * The cached OCL query for the '{@link #getTypeId() <em>Get Type Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TYPE_ID__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRootTypeId getTypeId() {
		if (GET_TYPE_ID__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(0));
			try {
				GET_TYPE_ID__EOCL_QRY = helper.createQuery(GET_TYPE_ID__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TYPE_ID__EOCL_QRY);
		return (InfrastructureRootTypeId) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRootTypeId withTypeId() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("InfrastructureRootTypeId");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		InfrastructureRootTypeId value = (InfrastructureRootTypeId) eObject;
		this.getCDAType().setTypeId(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setTypeId(InfrastructureRootTypeId value) {
		this.getCDAType().setTypeId(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ID__EOCL_EXP = "self.id.oclAsType(datatypes::II)";

	/**
	 * The cached OCL query for the '{@link #getId() <em>Get Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ID__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II getId() {
		if (GET_ID__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(3));
			try {
				GET_ID__EOCL_QRY = helper.createQuery(GET_ID__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ID__EOCL_QRY);
		return (II) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II withId() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("II");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		II value = (II) eObject;
		this.getCDAType().setId(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setId(II value) {
		this.getCDAType().setId(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCode() <em>Get Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CODE__EOCL_EXP = "self.code.oclAsType(datatypes::CE)";

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
	public CE getCode() {
		if (GET_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(6));
			try {
				GET_CODE__EOCL_QRY = helper.createQuery(GET_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CODE__EOCL_QRY);
		return (CE) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE withCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CE");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CE value = (CE) eObject;
		this.getCDAType().setCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setCode(CE value) {
		this.getCDAType().setCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TITLE__EOCL_EXP = "self.title.oclAsType(datatypes::ST)";

	/**
	 * The cached OCL query for the '{@link #getTitle() <em>Get Title</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TITLE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getTitle() {
		if (GET_TITLE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(9));
			try {
				GET_TITLE__EOCL_QRY = helper.createQuery(GET_TITLE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TITLE__EOCL_QRY);
		return (ST) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST withTitle() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ST");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ST value = (ST) eObject;
		this.getCDAType().setTitle(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setTitle(ST value) {
		this.getCDAType().setTitle(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEffectiveTime() <em>Get Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EFFECTIVE_TIME__EOCL_EXP = "self.effectiveTime.oclAsType(datatypes::TS)";

	/**
	 * The cached OCL query for the '{@link #getEffectiveTime() <em>Get Effective Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EFFECTIVE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS getEffectiveTime() {
		if (GET_EFFECTIVE_TIME__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(12));
			try {
				GET_EFFECTIVE_TIME__EOCL_QRY = helper.createQuery(GET_EFFECTIVE_TIME__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EFFECTIVE_TIME__EOCL_QRY);
		return (TS) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS withEffectiveTime() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("TS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		TS value = (TS) eObject;
		this.getCDAType().setEffectiveTime(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setEffectiveTime(TS value) {
		this.getCDAType().setEffectiveTime(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConfidentialityCode() <em>Get Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONFIDENTIALITY_CODE__EOCL_EXP = "self.confidentialityCode.oclAsType(datatypes::CE)";

	/**
	 * The cached OCL query for the '{@link #getConfidentialityCode() <em>Get Confidentiality Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONFIDENTIALITY_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getConfidentialityCode() {
		if (GET_CONFIDENTIALITY_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(15));
			try {
				GET_CONFIDENTIALITY_CODE__EOCL_QRY = helper.createQuery(GET_CONFIDENTIALITY_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONFIDENTIALITY_CODE__EOCL_QRY);
		return (CE) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE withConfidentialityCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CE");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CE value = (CE) eObject;
		this.getCDAType().setConfidentialityCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setConfidentialityCode(CE value) {
		this.getCDAType().setConfidentialityCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getLanguageCode() <em>Get Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LANGUAGE_CODE__EOCL_EXP = "self.languageCode.oclAsType(datatypes::CS)";

	/**
	 * The cached OCL query for the '{@link #getLanguageCode() <em>Get Language Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LANGUAGE_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS getLanguageCode() {
		if (GET_LANGUAGE_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(18));
			try {
				GET_LANGUAGE_CODE__EOCL_QRY = helper.createQuery(GET_LANGUAGE_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LANGUAGE_CODE__EOCL_QRY);
		return (CS) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS withLanguageCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CS value = (CS) eObject;
		this.getCDAType().setLanguageCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setLanguageCode(CS value) {
		this.getCDAType().setLanguageCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getRecordTargets() <em>Get Record Targets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordTargets()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RECORD_TARGETS__EOCL_EXP = "self.getRecordTargets()->select(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget)).oclAsType(cda::RecordTarget)";

	/**
	 * The cached OCL query for the '{@link #getRecordTargets() <em>Get Record Targets</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordTargets()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RECORD_TARGETS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordTarget> getRecordTargets() {
		if (GET_RECORD_TARGETS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(21));
			try {
				GET_RECORD_TARGETS__EOCL_QRY = helper.createQuery(GET_RECORD_TARGETS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RECORD_TARGETS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RecordTarget> result = (Collection<RecordTarget>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<RecordTarget>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTarget addRecordTarget() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("RecordTarget");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		RecordTarget value = (RecordTarget) eObject;
		this.getCDAType().getRecordTargets().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions addRecordTarget(RecordTarget value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getComponent() <em>Get Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMPONENT__EOCL_EXP = "self.getComponent2s()->select(component2 : cda::Component2 | not component2.oclIsUndefined() and component2.oclIsKindOf(cda::Component2))->asSequence()->first().oclAsType(cda::Component2)";

	/**
	 * The cached OCL query for the '{@link #getComponent() <em>Get Component</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMPONENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component2 getComponent() {
		if (GET_COMPONENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(30));
			try {
				GET_COMPONENT__EOCL_QRY = helper.createQuery(GET_COMPONENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMPONENT__EOCL_QRY);
		return (Component2) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component2 withComponent() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Component2");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Component2 value = (Component2) eObject;
		this.getCDAType().setComponent(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setComponent(Component2 value) {
		this.getCDAType().setComponent(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataEnterer() <em>Get Data Enterer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEnterer()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_ENTERER__EOCL_EXP = "self.getDataEnterers()->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->asSequence()->first().oclAsType(cda::DataEnterer)";

	/**
	 * The cached OCL query for the '{@link #getDataEnterer() <em>Get Data Enterer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEnterer()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_ENTERER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEnterer getDataEnterer() {
		if (GET_DATA_ENTERER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(33));
			try {
				GET_DATA_ENTERER__EOCL_QRY = helper.createQuery(GET_DATA_ENTERER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DATA_ENTERER__EOCL_QRY);
		return (DataEnterer) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEnterer withDataEnterer() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("DataEnterer");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		DataEnterer value = (DataEnterer) eObject;
		this.getCDAType().setDataEnterer(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setDataEnterer(DataEnterer value) {
		this.getCDAType().setDataEnterer(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInformationRecipients() <em>Get Information Recipients</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationRecipients()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFORMATION_RECIPIENTS__EOCL_EXP = "self.getInformationRecipients()->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient)).oclAsType(cda::InformationRecipient)";

	/**
	 * The cached OCL query for the '{@link #getInformationRecipients() <em>Get Information Recipients</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationRecipients()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFORMATION_RECIPIENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationRecipient> getInformationRecipients() {
		if (GET_INFORMATION_RECIPIENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(36));
			try {
				GET_INFORMATION_RECIPIENTS__EOCL_QRY = helper.createQuery(GET_INFORMATION_RECIPIENTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFORMATION_RECIPIENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InformationRecipient> result = (Collection<InformationRecipient>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<InformationRecipient>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationRecipient addInformationRecipient() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("InformationRecipient");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		InformationRecipient value = (InformationRecipient) eObject;
		this.getCDAType().getInformationRecipients().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions addInformationRecipient(InformationRecipient value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getLegalAuthenticator() <em>Get Legal Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LEGAL_AUTHENTICATOR__EOCL_EXP = "self.getLegalAuthenticators()->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->asSequence()->first().oclAsType(cda::LegalAuthenticator)";

	/**
	 * The cached OCL query for the '{@link #getLegalAuthenticator() <em>Get Legal Authenticator</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LEGAL_AUTHENTICATOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalAuthenticator getLegalAuthenticator() {
		if (GET_LEGAL_AUTHENTICATOR__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(39));
			try {
				GET_LEGAL_AUTHENTICATOR__EOCL_QRY = helper.createQuery(GET_LEGAL_AUTHENTICATOR__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LEGAL_AUTHENTICATOR__EOCL_QRY);
		return (LegalAuthenticator) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalAuthenticator withLegalAuthenticator() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("LegalAuthenticator");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		LegalAuthenticator value = (LegalAuthenticator) eObject;
		this.getCDAType().setLegalAuthenticator(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setLegalAuthenticator(LegalAuthenticator value) {
		this.getCDAType().setLegalAuthenticator(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAuthenticators() <em>Get Authenticators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticators()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AUTHENTICATORS__EOCL_EXP = "self.getAuthenticators()->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator)).oclAsType(cda::Authenticator)";

	/**
	 * The cached OCL query for the '{@link #getAuthenticators() <em>Get Authenticators</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticators()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AUTHENTICATORS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Authenticator> getAuthenticators() {
		if (GET_AUTHENTICATORS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(42));
			try {
				GET_AUTHENTICATORS__EOCL_QRY = helper.createQuery(GET_AUTHENTICATORS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AUTHENTICATORS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Authenticator> result = (Collection<Authenticator>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<Authenticator>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authenticator addAuthenticator() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Authenticator");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Authenticator value = (Authenticator) eObject;
		this.getCDAType().getAuthenticators().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions addAuthenticator(Authenticator value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCare() <em>Get Plan Of Care</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCare()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::PlanOfCareSection))->asSequence()->first().oclAsType(domain::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCare() <em>Get Plan Of Care</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCare()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection getPlanOfCare() {
		if (GET_PLAN_OF_CARE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(45));
			try {
				GET_PLAN_OF_CARE__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE__EOCL_QRY);
		return (IPlanOfCareSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection withPlanOfCare() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("PlanOfCareSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("PlanOfCareSection");
		IPlanOfCareSection value = (IPlanOfCareSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setPlanOfCare(IPlanOfCareSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergies() <em>Get Allergies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergies()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::AllergiesReactionsSection))->asSequence()->first().oclAsType(domain::AllergiesReactionsSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergies() <em>Get Allergies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergies()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergiesReactionsSection getAllergies() {
		if (GET_ALLERGIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(48));
			try {
				GET_ALLERGIES__EOCL_QRY = helper.createQuery(GET_ALLERGIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES__EOCL_QRY);
		return (IAllergiesReactionsSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergiesReactionsSection withAllergies() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("AllergiesReactionsSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("AllergiesReactionsSection");
		IAllergiesReactionsSection value = (IAllergiesReactionsSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setAllergies(IAllergiesReactionsSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getActiveProblems() <em>Get Active Problems</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveProblems()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACTIVE_PROBLEMS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ProblemListSection))->asSequence()->first().oclAsType(domain::ProblemListSection)";

	/**
	 * The cached OCL query for the '{@link #getActiveProblems() <em>Get Active Problems</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveProblems()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACTIVE_PROBLEMS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemListSection getActiveProblems() {
		if (GET_ACTIVE_PROBLEMS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(51));
			try {
				GET_ACTIVE_PROBLEMS__EOCL_QRY = helper.createQuery(GET_ACTIVE_PROBLEMS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACTIVE_PROBLEMS__EOCL_QRY);
		return (IProblemListSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemListSection withActiveProblems() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ProblemListSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ProblemListSection");
		IProblemListSection value = (IProblemListSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setActiveProblems(IProblemListSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeDiagnosis() <em>Get Discharge Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_DIAGNOSIS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::DischargeDiagnosisSection))->asSequence()->first().oclAsType(domain::DischargeDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getDischargeDiagnosis() <em>Get Discharge Diagnosis</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_DIAGNOSIS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeDiagnosisSection getDischargeDiagnosis() {
		if (GET_DISCHARGE_DIAGNOSIS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(54));
			try {
				GET_DISCHARGE_DIAGNOSIS__EOCL_QRY = helper.createQuery(GET_DISCHARGE_DIAGNOSIS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISCHARGE_DIAGNOSIS__EOCL_QRY);
		return (IDischargeDiagnosisSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeDiagnosisSection withDischargeDiagnosis() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("DischargeDiagnosisSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("DischargeDiagnosisSection");
		IDischargeDiagnosisSection value = (IDischargeDiagnosisSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setDischargeDiagnosis(IDischargeDiagnosisSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAdvanceDirectives() <em>Get Advance Directives</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectives()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ADVANCE_DIRECTIVES__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::AdvanceDirectivesSection))->asSequence()->first().oclAsType(domain::AdvanceDirectivesSection)";

	/**
	 * The cached OCL query for the '{@link #getAdvanceDirectives() <em>Get Advance Directives</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdvanceDirectives()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ADVANCE_DIRECTIVES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectivesSection getAdvanceDirectives() {
		if (GET_ADVANCE_DIRECTIVES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(57));
			try {
				GET_ADVANCE_DIRECTIVES__EOCL_QRY = helper.createQuery(GET_ADVANCE_DIRECTIVES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ADVANCE_DIRECTIVES__EOCL_QRY);
		return (IAdvanceDirectivesSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAdvanceDirectivesSection withAdvanceDirectives() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("AdvanceDirectivesSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("AdvanceDirectivesSection");
		IAdvanceDirectivesSection value = (IAdvanceDirectivesSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setAdvanceDirectives(IAdvanceDirectivesSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizations() <em>Get Immunizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizations()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ImmunizationsSection))->asSequence()->first().oclAsType(domain::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizations() <em>Get Immunizations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizations()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunizationsSection getImmunizations() {
		if (GET_IMMUNIZATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(60));
			try {
				GET_IMMUNIZATIONS__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS__EOCL_QRY);
		return (IImmunizationsSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunizationsSection withImmunizations() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ImmunizationsSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ImmunizationsSection");
		IImmunizationsSection value = (IImmunizationsSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setImmunizations(IImmunizationsSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicalEquipment() <em>Get Medical Equipment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipment()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICAL_EQUIPMENT__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::MedicalEquipmentSection))->asSequence()->first().oclAsType(domain::MedicalEquipmentSection)";

	/**
	 * The cached OCL query for the '{@link #getMedicalEquipment() <em>Get Medical Equipment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicalEquipment()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICAL_EQUIPMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicalEquipmentSection getMedicalEquipment() {
		if (GET_MEDICAL_EQUIPMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getDischargeInstructions(),
				IDomainPackage.eINSTANCE.getDischargeInstructions().getEAllOperations().get(63));
			try {
				GET_MEDICAL_EQUIPMENT__EOCL_QRY = helper.createQuery(GET_MEDICAL_EQUIPMENT__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICAL_EQUIPMENT__EOCL_QRY);
		return (IMedicalEquipmentSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicalEquipmentSection withMedicalEquipment() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("MedicalEquipmentSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("MedicalEquipmentSection");
		IMedicalEquipmentSection value = (IMedicalEquipmentSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeInstructions setMedicalEquipment(IMedicalEquipmentSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
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
			case IDomainPackage.DISCHARGE_INSTRUCTIONS__CDA_TYPE:
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
			case IDomainPackage.DISCHARGE_INSTRUCTIONS__CDA_TYPE:
				setCDAType((ClinicalDocument) newValue);
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
			case IDomainPackage.DISCHARGE_INSTRUCTIONS__CDA_TYPE:
				setCDAType((ClinicalDocument) null);
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
			case IDomainPackage.DISCHARGE_INSTRUCTIONS__CDA_TYPE:
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
	public IDischargeInstructions init() {
		CDAUtil.init(this);
		return this;
	}
} // DischargeInstructionsImpl
