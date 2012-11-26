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
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IAbdomenSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IBreastSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IChestWallSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ICondition;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IEarsNoseMouthThroatSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IEarsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IEndocrineSystemSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IExtremitiesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IEyesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IGeneralAppearanceSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IGenitaliaSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHeadSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IHeartSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IIntegumentarySystemSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.ILymphaticSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMouthThroatTeethSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IMusculoskeletalSystemSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.INeckSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.INeurologicSystemSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.INoseSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IPhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IRectumSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IRespiratorySystemSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IThoraxLungsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IVesselsSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IVisibleImplantedMedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.hitsp.domain.IVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Exam Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.domain.impl.PhysicalExamSectionImpl#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalExamSectionImpl extends EObjectImpl implements IPhysicalExamSection {
	/**
	 * The cached value of the '{@link #getCDAType() <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDAType()
	 * @generated
	 * @ordered
	 */
	protected Section cDAType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalExamSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDomainPackage.eINSTANCE.getPhysicalExamSection();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Section getCDAType() {
		if (cDAType != null && cDAType.eIsProxy()) {
			InternalEObject oldCDAType = (InternalEObject) cDAType;
			cDAType = (Section) eResolveProxy(oldCDAType);
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
	public Section basicGetCDAType() {
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDAType(Section newCDAType) {
		cDAType = newCDAType;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection() <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::VitalSignsSection))->asSequence()->first().oclAsType(domain::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection() <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignsSection getVitalSignsSection() {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(0));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (IVitalSignsSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignsSection withVitalSignsSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("VitalSignsSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("VitalSignsSection");
		IVitalSignsSection value = (IVitalSignsSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setVitalSignsSection(IVitalSignsSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeneralAppearanceSection() <em>Get General Appearance Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralAppearanceSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENERAL_APPEARANCE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::GeneralAppearanceSection))->asSequence()->first().oclAsType(domain::GeneralAppearanceSection)";

	/**
	 * The cached OCL query for the '{@link #getGeneralAppearanceSection() <em>Get General Appearance Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralAppearanceSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENERAL_APPEARANCE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGeneralAppearanceSection getGeneralAppearanceSection() {
		if (GET_GENERAL_APPEARANCE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(3));
			try {
				GET_GENERAL_APPEARANCE_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_APPEARANCE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENERAL_APPEARANCE_SECTION__EOCL_QRY);
		return (IGeneralAppearanceSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGeneralAppearanceSection withGeneralAppearanceSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("GeneralAppearanceSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("GeneralAppearanceSection");
		IGeneralAppearanceSection value = (IGeneralAppearanceSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setGeneralAppearanceSection(IGeneralAppearanceSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVisibleImplantedMedicalDevicesSection() <em>Get Visible Implanted Medical Devices Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleImplantedMedicalDevicesSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::VisibleImplantedMedicalDevicesSection))->asSequence()->first().oclAsType(domain::VisibleImplantedMedicalDevicesSection)";

	/**
	 * The cached OCL query for the '{@link #getVisibleImplantedMedicalDevicesSection() <em>Get Visible Implanted Medical Devices Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleImplantedMedicalDevicesSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisibleImplantedMedicalDevicesSection getVisibleImplantedMedicalDevicesSection() {
		if (GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(6));
			try {
				GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_QRY = helper.createQuery(GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_QRY);
		return (IVisibleImplantedMedicalDevicesSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVisibleImplantedMedicalDevicesSection withVisibleImplantedMedicalDevicesSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("VisibleImplantedMedicalDevicesSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("VisibleImplantedMedicalDevicesSection");
		IVisibleImplantedMedicalDevicesSection value = (IVisibleImplantedMedicalDevicesSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setVisibleImplantedMedicalDevicesSection(IVisibleImplantedMedicalDevicesSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getIntegumentarySystemSection() <em>Get Integumentary System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegumentarySystemSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::IntegumentarySystemSection))->asSequence()->first().oclAsType(domain::IntegumentarySystemSection)";

	/**
	 * The cached OCL query for the '{@link #getIntegumentarySystemSection() <em>Get Integumentary System Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegumentarySystemSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIntegumentarySystemSection getIntegumentarySystemSection() {
		if (GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(9));
			try {
				GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_QRY = helper.createQuery(GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_QRY);
		return (IIntegumentarySystemSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IIntegumentarySystemSection withIntegumentarySystemSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IntegumentarySystemSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("IntegumentarySystemSection");
		IIntegumentarySystemSection value = (IIntegumentarySystemSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setIntegumentarySystemSection(IIntegumentarySystemSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHeadSection() <em>Get Head Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEAD_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HeadSection))->asSequence()->first().oclAsType(domain::HeadSection)";

	/**
	 * The cached OCL query for the '{@link #getHeadSection() <em>Get Head Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEAD_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHeadSection getHeadSection() {
		if (GET_HEAD_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(12));
			try {
				GET_HEAD_SECTION__EOCL_QRY = helper.createQuery(GET_HEAD_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEAD_SECTION__EOCL_QRY);
		return (IHeadSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHeadSection withHeadSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HeadSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("HeadSection");
		IHeadSection value = (IHeadSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setHeadSection(IHeadSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEyesSection() <em>Get Eyes Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEyesSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EYES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::EyesSection))->asSequence()->first().oclAsType(domain::EyesSection)";

	/**
	 * The cached OCL query for the '{@link #getEyesSection() <em>Get Eyes Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEyesSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EYES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEyesSection getEyesSection() {
		if (GET_EYES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(15));
			try {
				GET_EYES_SECTION__EOCL_QRY = helper.createQuery(GET_EYES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EYES_SECTION__EOCL_QRY);
		return (IEyesSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEyesSection withEyesSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("EyesSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("EyesSection");
		IEyesSection value = (IEyesSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setEyesSection(IEyesSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEarsNoseMouthThroatSection() <em>Get Ears Nose Mouth Throat Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarsNoseMouthThroatSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::EarsNoseMouthThroatSection))->asSequence()->first().oclAsType(domain::EarsNoseMouthThroatSection)";

	/**
	 * The cached OCL query for the '{@link #getEarsNoseMouthThroatSection() <em>Get Ears Nose Mouth Throat Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarsNoseMouthThroatSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEarsNoseMouthThroatSection getEarsNoseMouthThroatSection() {
		if (GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(18));
			try {
				GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_QRY = helper.createQuery(GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_QRY);
		return (IEarsNoseMouthThroatSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEarsNoseMouthThroatSection withEarsNoseMouthThroatSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("EarsNoseMouthThroatSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("EarsNoseMouthThroatSection");
		IEarsNoseMouthThroatSection value = (IEarsNoseMouthThroatSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setEarsNoseMouthThroatSection(IEarsNoseMouthThroatSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEarsSection() <em>Get Ears Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarsSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EARS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::EarsSection))->asSequence()->first().oclAsType(domain::EarsSection)";

	/**
	 * The cached OCL query for the '{@link #getEarsSection() <em>Get Ears Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarsSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EARS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEarsSection getEarsSection() {
		if (GET_EARS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(21));
			try {
				GET_EARS_SECTION__EOCL_QRY = helper.createQuery(GET_EARS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EARS_SECTION__EOCL_QRY);
		return (IEarsSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEarsSection withEarsSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("EarsSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("EarsSection");
		IEarsSection value = (IEarsSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setEarsSection(IEarsSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNoseSection() <em>Get Nose Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoseSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NOSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::NoseSection))->asSequence()->first().oclAsType(domain::NoseSection)";

	/**
	 * The cached OCL query for the '{@link #getNoseSection() <em>Get Nose Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoseSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NOSE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INoseSection getNoseSection() {
		if (GET_NOSE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(24));
			try {
				GET_NOSE_SECTION__EOCL_QRY = helper.createQuery(GET_NOSE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NOSE_SECTION__EOCL_QRY);
		return (INoseSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INoseSection withNoseSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("NoseSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("NoseSection");
		INoseSection value = (INoseSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setNoseSection(INoseSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMouthThroatTeethSection() <em>Get Mouth Throat Teeth Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouthThroatTeethSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MOUTH_THROAT_TEETH_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::MouthThroatTeethSection))->asSequence()->first().oclAsType(domain::MouthThroatTeethSection)";

	/**
	 * The cached OCL query for the '{@link #getMouthThroatTeethSection() <em>Get Mouth Throat Teeth Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouthThroatTeethSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MOUTH_THROAT_TEETH_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMouthThroatTeethSection getMouthThroatTeethSection() {
		if (GET_MOUTH_THROAT_TEETH_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(27));
			try {
				GET_MOUTH_THROAT_TEETH_SECTION__EOCL_QRY = helper.createQuery(GET_MOUTH_THROAT_TEETH_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MOUTH_THROAT_TEETH_SECTION__EOCL_QRY);
		return (IMouthThroatTeethSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMouthThroatTeethSection withMouthThroatTeethSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("MouthThroatTeethSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("MouthThroatTeethSection");
		IMouthThroatTeethSection value = (IMouthThroatTeethSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setMouthThroatTeethSection(IMouthThroatTeethSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNeckSection() <em>Get Neck Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeckSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NECK_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::NeckSection))->asSequence()->first().oclAsType(domain::NeckSection)";

	/**
	 * The cached OCL query for the '{@link #getNeckSection() <em>Get Neck Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeckSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NECK_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INeckSection getNeckSection() {
		if (GET_NECK_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(30));
			try {
				GET_NECK_SECTION__EOCL_QRY = helper.createQuery(GET_NECK_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NECK_SECTION__EOCL_QRY);
		return (INeckSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INeckSection withNeckSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("NeckSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("NeckSection");
		INeckSection value = (INeckSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setNeckSection(INeckSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEndocrineSystemSection() <em>Get Endocrine System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndocrineSystemSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENDOCRINE_SYSTEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::EndocrineSystemSection))->asSequence()->first().oclAsType(domain::EndocrineSystemSection)";

	/**
	 * The cached OCL query for the '{@link #getEndocrineSystemSection() <em>Get Endocrine System Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndocrineSystemSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENDOCRINE_SYSTEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEndocrineSystemSection getEndocrineSystemSection() {
		if (GET_ENDOCRINE_SYSTEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(33));
			try {
				GET_ENDOCRINE_SYSTEM_SECTION__EOCL_QRY = helper.createQuery(GET_ENDOCRINE_SYSTEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENDOCRINE_SYSTEM_SECTION__EOCL_QRY);
		return (IEndocrineSystemSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IEndocrineSystemSection withEndocrineSystemSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("EndocrineSystemSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("EndocrineSystemSection");
		IEndocrineSystemSection value = (IEndocrineSystemSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setEndocrineSystemSection(IEndocrineSystemSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getThoraxLungsSection() <em>Get Thorax Lungs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoraxLungsSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_THORAX_LUNGS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ThoraxLungsSection))->asSequence()->first().oclAsType(domain::ThoraxLungsSection)";

	/**
	 * The cached OCL query for the '{@link #getThoraxLungsSection() <em>Get Thorax Lungs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoraxLungsSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_THORAX_LUNGS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IThoraxLungsSection getThoraxLungsSection() {
		if (GET_THORAX_LUNGS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(36));
			try {
				GET_THORAX_LUNGS_SECTION__EOCL_QRY = helper.createQuery(GET_THORAX_LUNGS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_THORAX_LUNGS_SECTION__EOCL_QRY);
		return (IThoraxLungsSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IThoraxLungsSection withThoraxLungsSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ThoraxLungsSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ThoraxLungsSection");
		IThoraxLungsSection value = (IThoraxLungsSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setThoraxLungsSection(IThoraxLungsSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getChestWallSection() <em>Get Chest Wall Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChestWallSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHEST_WALL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ChestWallSection))->asSequence()->first().oclAsType(domain::ChestWallSection)";

	/**
	 * The cached OCL query for the '{@link #getChestWallSection() <em>Get Chest Wall Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChestWallSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHEST_WALL_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChestWallSection getChestWallSection() {
		if (GET_CHEST_WALL_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(39));
			try {
				GET_CHEST_WALL_SECTION__EOCL_QRY = helper.createQuery(GET_CHEST_WALL_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHEST_WALL_SECTION__EOCL_QRY);
		return (IChestWallSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChestWallSection withChestWallSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ChestWallSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ChestWallSection");
		IChestWallSection value = (IChestWallSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setChestWallSection(IChestWallSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getBreastSection() <em>Get Breast Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreastSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BREAST_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::BreastSection))->asSequence()->first().oclAsType(domain::BreastSection)";

	/**
	 * The cached OCL query for the '{@link #getBreastSection() <em>Get Breast Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreastSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BREAST_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBreastSection getBreastSection() {
		if (GET_BREAST_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(42));
			try {
				GET_BREAST_SECTION__EOCL_QRY = helper.createQuery(GET_BREAST_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BREAST_SECTION__EOCL_QRY);
		return (IBreastSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBreastSection withBreastSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("BreastSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("BreastSection");
		IBreastSection value = (IBreastSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setBreastSection(IBreastSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHeartSection() <em>Get Heart Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEART_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HeartSection))->asSequence()->first().oclAsType(domain::HeartSection)";

	/**
	 * The cached OCL query for the '{@link #getHeartSection() <em>Get Heart Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEART_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHeartSection getHeartSection() {
		if (GET_HEART_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(45));
			try {
				GET_HEART_SECTION__EOCL_QRY = helper.createQuery(GET_HEART_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEART_SECTION__EOCL_QRY);
		return (IHeartSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHeartSection withHeartSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HeartSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("HeartSection");
		IHeartSection value = (IHeartSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setHeartSection(IHeartSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getRespiratorySystemSection() <em>Get Respiratory System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespiratorySystemSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESPIRATORY_SYSTEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::RespiratorySystemSection))->asSequence()->first().oclAsType(domain::RespiratorySystemSection)";

	/**
	 * The cached OCL query for the '{@link #getRespiratorySystemSection() <em>Get Respiratory System Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespiratorySystemSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESPIRATORY_SYSTEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRespiratorySystemSection getRespiratorySystemSection() {
		if (GET_RESPIRATORY_SYSTEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(48));
			try {
				GET_RESPIRATORY_SYSTEM_SECTION__EOCL_QRY = helper.createQuery(GET_RESPIRATORY_SYSTEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESPIRATORY_SYSTEM_SECTION__EOCL_QRY);
		return (IRespiratorySystemSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRespiratorySystemSection withRespiratorySystemSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("RespiratorySystemSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("RespiratorySystemSection");
		IRespiratorySystemSection value = (IRespiratorySystemSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setRespiratorySystemSection(IRespiratorySystemSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAbdomenSection() <em>Get Abdomen Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbdomenSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ABDOMEN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::AbdomenSection))->asSequence()->first().oclAsType(domain::AbdomenSection)";

	/**
	 * The cached OCL query for the '{@link #getAbdomenSection() <em>Get Abdomen Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbdomenSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ABDOMEN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAbdomenSection getAbdomenSection() {
		if (GET_ABDOMEN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(51));
			try {
				GET_ABDOMEN_SECTION__EOCL_QRY = helper.createQuery(GET_ABDOMEN_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ABDOMEN_SECTION__EOCL_QRY);
		return (IAbdomenSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAbdomenSection withAbdomenSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("AbdomenSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("AbdomenSection");
		IAbdomenSection value = (IAbdomenSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setAbdomenSection(IAbdomenSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getLymphaticSection() <em>Get Lymphatic Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLymphaticSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LYMPHATIC_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::LymphaticSection))->asSequence()->first().oclAsType(domain::LymphaticSection)";

	/**
	 * The cached OCL query for the '{@link #getLymphaticSection() <em>Get Lymphatic Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLymphaticSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LYMPHATIC_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILymphaticSection getLymphaticSection() {
		if (GET_LYMPHATIC_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(54));
			try {
				GET_LYMPHATIC_SECTION__EOCL_QRY = helper.createQuery(GET_LYMPHATIC_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LYMPHATIC_SECTION__EOCL_QRY);
		return (ILymphaticSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ILymphaticSection withLymphaticSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("LymphaticSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("LymphaticSection");
		ILymphaticSection value = (ILymphaticSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setLymphaticSection(ILymphaticSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVesselsSection() <em>Get Vessels Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselsSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VESSELS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::VesselsSection))->asSequence()->first().oclAsType(domain::VesselsSection)";

	/**
	 * The cached OCL query for the '{@link #getVesselsSection() <em>Get Vessels Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselsSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VESSELS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVesselsSection getVesselsSection() {
		if (GET_VESSELS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(57));
			try {
				GET_VESSELS_SECTION__EOCL_QRY = helper.createQuery(GET_VESSELS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VESSELS_SECTION__EOCL_QRY);
		return (IVesselsSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVesselsSection withVesselsSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("VesselsSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("VesselsSection");
		IVesselsSection value = (IVesselsSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setVesselsSection(IVesselsSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMusculoskeletalSystemSection() <em>Get Musculoskeletal System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusculoskeletalSystemSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::MusculoskeletalSystemSection))->asSequence()->first().oclAsType(domain::MusculoskeletalSystemSection)";

	/**
	 * The cached OCL query for the '{@link #getMusculoskeletalSystemSection() <em>Get Musculoskeletal System Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusculoskeletalSystemSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMusculoskeletalSystemSection getMusculoskeletalSystemSection() {
		if (GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(60));
			try {
				GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_QRY = helper.createQuery(GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_QRY);
		return (IMusculoskeletalSystemSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMusculoskeletalSystemSection withMusculoskeletalSystemSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("MusculoskeletalSystemSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("MusculoskeletalSystemSection");
		IMusculoskeletalSystemSection value = (IMusculoskeletalSystemSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setMusculoskeletalSystemSection(IMusculoskeletalSystemSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNeurologicSystemSection() <em>Get Neurologic System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeurologicSystemSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::NeurologicSystemSection))->asSequence()->first().oclAsType(domain::NeurologicSystemSection)";

	/**
	 * The cached OCL query for the '{@link #getNeurologicSystemSection() <em>Get Neurologic System Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeurologicSystemSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INeurologicSystemSection getNeurologicSystemSection() {
		if (GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(63));
			try {
				GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_QRY = helper.createQuery(GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_QRY);
		return (INeurologicSystemSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INeurologicSystemSection withNeurologicSystemSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("NeurologicSystemSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("NeurologicSystemSection");
		INeurologicSystemSection value = (INeurologicSystemSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setNeurologicSystemSection(INeurologicSystemSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGenitaliaSection() <em>Get Genitalia Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenitaliaSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENITALIA_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::GenitaliaSection))->asSequence()->first().oclAsType(domain::GenitaliaSection)";

	/**
	 * The cached OCL query for the '{@link #getGenitaliaSection() <em>Get Genitalia Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenitaliaSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENITALIA_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGenitaliaSection getGenitaliaSection() {
		if (GET_GENITALIA_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(66));
			try {
				GET_GENITALIA_SECTION__EOCL_QRY = helper.createQuery(GET_GENITALIA_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENITALIA_SECTION__EOCL_QRY);
		return (IGenitaliaSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGenitaliaSection withGenitaliaSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("GenitaliaSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("GenitaliaSection");
		IGenitaliaSection value = (IGenitaliaSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setGenitaliaSection(IGenitaliaSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getRectumSection() <em>Get Rectum Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectumSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RECTUM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::RectumSection))->asSequence()->first().oclAsType(domain::RectumSection)";

	/**
	 * The cached OCL query for the '{@link #getRectumSection() <em>Get Rectum Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectumSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RECTUM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRectumSection getRectumSection() {
		if (GET_RECTUM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(69));
			try {
				GET_RECTUM_SECTION__EOCL_QRY = helper.createQuery(GET_RECTUM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RECTUM_SECTION__EOCL_QRY);
		return (IRectumSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRectumSection withRectumSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("RectumSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("RectumSection");
		IRectumSection value = (IRectumSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setRectumSection(IRectumSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getExtremitiesSection() <em>Get Extremities Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtremitiesSection()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXTREMITIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ExtremitiesSection))->asSequence()->first().oclAsType(domain::ExtremitiesSection)";

	/**
	 * The cached OCL query for the '{@link #getExtremitiesSection() <em>Get Extremities Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtremitiesSection()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXTREMITIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExtremitiesSection getExtremitiesSection() {
		if (GET_EXTREMITIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(72));
			try {
				GET_EXTREMITIES_SECTION__EOCL_QRY = helper.createQuery(GET_EXTREMITIES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXTREMITIES_SECTION__EOCL_QRY);
		return (IExtremitiesSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IExtremitiesSection withExtremitiesSection() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ExtremitiesSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ExtremitiesSection");
		IExtremitiesSection value = (IExtremitiesSection) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section) eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection setExtremitiesSection(IExtremitiesSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConditions() <em>Get Conditions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONDITIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::Condition)).oclAsType(domain::Condition)";

	/**
	 * The cached OCL query for the '{@link #getConditions() <em>Get Conditions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditions()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONDITIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ICondition> getConditions() {
		if (GET_CONDITIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getPhysicalExamSection(),
				IDomainPackage.eINSTANCE.getPhysicalExamSection().getEAllOperations().get(75));
			try {
				GET_CONDITIONS__EOCL_QRY = helper.createQuery(GET_CONDITIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONDITIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ICondition> result = (Collection<ICondition>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<ICondition>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ICondition addCondition() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Condition");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("Condition");
		ICondition value = (ICondition) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Act) eObject);
		this.getCDAType().addAct((org.openhealthtools.mdht.uml.cda.Act) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPhysicalExamSection addCondition(ICondition value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDomainPackage.PHYSICAL_EXAM_SECTION__CDA_TYPE:
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
			case IDomainPackage.PHYSICAL_EXAM_SECTION__CDA_TYPE:
				setCDAType((Section) newValue);
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
			case IDomainPackage.PHYSICAL_EXAM_SECTION__CDA_TYPE:
				setCDAType((Section) null);
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
			case IDomainPackage.PHYSICAL_EXAM_SECTION__CDA_TYPE:
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
	public IPhysicalExamSection init() {
		CDAUtil.init(this);
		return this;
	}
} // PhysicalExamSectionImpl
